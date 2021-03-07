package com.juliajiang.aopdemo.datapermission.aop;

import com.juliajiang.aopdemo.common.IDataPermission;
import com.juliajiang.aopdemo.datapermission.dto.DataPermissionDto;
import com.juliajiang.aopdemo.datapermission.repository.DataPermissionRepository;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/3/7 4:08 下午
 */
@Aspect
@Slf4j
@Component
public class DataPermissionAspect {


    @Resource
    private DataPermissionRepository dataPermissionRepository;

    @Pointcut("@annotation(com.juliajiang.aopdemo.datapermission.aop.DataPermission)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        String sql = "";
        // 1. 获取当前用户id
        String employeeId = "0001";
        // 2. 查缓存
        // 3. 判断是否是超级管理员
        // 4. 查权限列表
        List<DataPermissionDto> list = dataPermissionRepository.selectDimension(employeeId);
        if (CollectionUtils.isEmpty(list)) {
            sql = "1=2";
        } else {
            // 4.1 获取注解的tableAlias
            DataPermission annotation = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(DataPermission.class);
            String alias = annotation.tableAlias();

            // 4.2 拼sql
            sql = alias + ".permission in ( ";
            // 将权限维度列表转为 and or 语句
            // inOutTypeCode,unitCode,budgetSubjectCode
            for (int i = 0; i < list.size(); i++) {
                DataPermissionDto dto = list.get(i);
                // 权限维度 double check
                if (StringUtils.isEmpty(dto.getDepartmentId()) || StringUtils.isEmpty(dto.getBusinessId())) {
                    continue;
                }
                if (i == 0) {
                    sql += String.format("\'%s,%s\'", dto.getDepartmentId(), dto.getBusinessId());
                } else {
                    sql += String.format(",\'%s,%s\'", dto.getDepartmentId(), dto.getBusinessId());
                }
            }
            sql += ")";

            // 4.3 存入redis
        }
        log.info("permission sql : {}", sql);

        // 5.把数据权限注入到业务代码请求参数
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof IDataPermission) {
                try {
                    Class clazz = arg.getClass();
                    Field permission = clazz.getSuperclass().getDeclaredField("permission");
                    permission.setAccessible(true);
                    permission.set(arg, sql);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    log.info("implement IDataPermission error");
                    e.printStackTrace();
                }
            }
        }
    }
}

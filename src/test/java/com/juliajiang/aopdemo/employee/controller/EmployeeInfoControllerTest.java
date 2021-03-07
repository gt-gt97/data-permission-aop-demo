package com.juliajiang.aopdemo.employee.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.juliajiang.aopdemo.DataPermissionApplication;
import com.juliajiang.aopdemo.common.JsonResult;
import com.juliajiang.aopdemo.employee.dto.EmployeeDTO;
import com.juliajiang.aopdemo.employee.dto.EmployeeReq;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/3/7 3:55 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataPermissionApplication.class)
@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
public class EmployeeInfoControllerTest {

    @Resource
    private EmployeeInfoController employeeInfoController;

    @Test
    public void test(){
        EmployeeReq req = new EmployeeReq();
        req.setIsTechnical("1");
        req.setSize(10);
        JsonResult<IPage<EmployeeDTO>> page = employeeInfoController.pageQuery(req);
        System.out.println(page);
    }
}
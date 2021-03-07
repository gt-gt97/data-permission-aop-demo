package com.juliajiang.aopdemo.employee.repository.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.juliajiang.aopdemo.employee.domain.storage.EmployeeInfo;
import com.juliajiang.aopdemo.employee.domain.mapper.EmployeeInfoMapper;
import com.juliajiang.aopdemo.employee.dto.EmployeeDTO;
import com.juliajiang.aopdemo.employee.repository.EmployeeInfoRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-03
 */
@Service
public class EmployeeInfoRepositoryImpl extends ServiceImpl<EmployeeInfoMapper, EmployeeInfo> implements EmployeeInfoRepository {

    @Resource
    private EmployeeInfoMapper employeeInfoMapper;

    @Override
    public IPage pageQuery(Page page, EmployeeDTO dto) {
        return employeeInfoMapper.pageQuery(page, dto);
    }
}

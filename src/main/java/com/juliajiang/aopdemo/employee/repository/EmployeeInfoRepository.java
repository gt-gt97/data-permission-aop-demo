package com.juliajiang.aopdemo.employee.repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.juliajiang.aopdemo.employee.domain.storage.EmployeeInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.juliajiang.aopdemo.employee.dto.EmployeeDTO;

/**
 * <p>
 * 员工信息表 服务类
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-03
 */
public interface EmployeeInfoRepository extends IService<EmployeeInfo> {

    /**
     * 分页查询
     * @param page
     * @param dto
     * @return
     */
    IPage pageQuery(Page page, EmployeeDTO dto);
}

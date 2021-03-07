package com.juliajiang.aopdemo.employee.domain.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.juliajiang.aopdemo.employee.domain.storage.EmployeeInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.juliajiang.aopdemo.employee.dto.EmployeeDTO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 员工信息表 Mapper 接口
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-03
 */
public interface EmployeeInfoMapper extends BaseMapper<EmployeeInfo> {

    /**
     * 分页查询
     *
     * @param page
     * @param dto
     * @return
     */
    IPage pageQuery(Page page, @Param("entity") EmployeeDTO dto);
}

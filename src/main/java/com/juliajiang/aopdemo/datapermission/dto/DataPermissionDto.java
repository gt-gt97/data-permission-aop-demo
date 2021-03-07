package com.juliajiang.aopdemo.datapermission.dto;

import lombok.Data;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/3/7 4:19 下午
 */
@Data
public class DataPermissionDto {
    /**
     * 员工号
     */
    private String employeeId;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 业务线id
     */
    private Integer businessId;
}

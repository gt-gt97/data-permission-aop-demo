package com.juliajiang.aopdemo.employee.dto;

import lombok.Data;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/3/4 5:14 下午
 */
@Data
public class EmployeeDTO {
    /**
     * 自增主键
     */
    private Long id;

    /**
     * 员工号
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 业务线id
     */
    private Integer businessId;

    /**
     * 员工地址
     */
    private String employeeAddress;

    /**
     * 员工手机号
     */
    private String employeePhone;

    /**
     * 数据权限
     */
    private String permission;

    /**
     * 是否属于技术序列
     */
    private String isTechnical;
}

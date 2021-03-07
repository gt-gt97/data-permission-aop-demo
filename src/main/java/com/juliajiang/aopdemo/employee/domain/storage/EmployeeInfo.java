package com.juliajiang.aopdemo.employee.domain.storage;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 员工信息表
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_employee_info")
public class EmployeeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
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

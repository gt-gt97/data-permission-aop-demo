package com.juliajiang.aopdemo.datapermission.domain.storage;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 数据权限表
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_data_permission")
public class DataPermission implements Serializable {

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
     * 部门id
     */
    private Integer departmentId;

    /**
     * 业务线id
     */
    private Integer businessId;


}

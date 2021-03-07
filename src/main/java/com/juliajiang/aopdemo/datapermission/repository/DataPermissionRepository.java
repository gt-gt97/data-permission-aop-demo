package com.juliajiang.aopdemo.datapermission.repository;

import com.juliajiang.aopdemo.datapermission.domain.storage.DataPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.juliajiang.aopdemo.datapermission.dto.DataPermissionDto;

import java.util.List;

/**
 * <p>
 * 数据权限表 服务类
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-07
 */
public interface DataPermissionRepository extends IService<DataPermission> {

    List<DataPermissionDto> selectDimension(String employeeId);
}

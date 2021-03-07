package com.juliajiang.aopdemo.datapermission.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.juliajiang.aopdemo.common.BaseAssembler;
import com.juliajiang.aopdemo.datapermission.domain.storage.DataPermission;
import com.juliajiang.aopdemo.datapermission.domain.mapper.DataPermissionMapper;
import com.juliajiang.aopdemo.datapermission.dto.DataPermissionDto;
import com.juliajiang.aopdemo.datapermission.repository.DataPermissionRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 数据权限表 服务实现类
 * </p>
 *
 * @author jiangfan.julia@gmail.com
 * @since 2021-03-07
 */
@Service
public class DataPermissionRepositoryImpl extends ServiceImpl<DataPermissionMapper, DataPermission> implements DataPermissionRepository {

    @Override
    public List<DataPermissionDto> selectDimension(String employeeId) {
        LambdaQueryWrapper<DataPermission> wrapper = new LambdaQueryWrapper<DataPermission>()
                .eq(!StringUtils.isEmpty(employeeId), DataPermission::getEmployeeId, employeeId);
        List<DataPermission> list = this.list(wrapper);
        return BaseAssembler.toDTOList(list, DataPermissionDto.class);
    }
}

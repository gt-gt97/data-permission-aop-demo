package com.juliajiang.aopdemo.common;

import lombok.Data;

/**
 * @author jiangfan.julia@gmail.com
 * @description
 * @since 2021/2/18 3:56 下午
 */
@Data
public class BaseReq implements IDataPermission {
    /**
     * 当前页码
     */
    private Integer current;
    /**
     * 页大小
     */
    private Integer size;

    /**
     * 数据权限字段
     */
    private String permission;

    @Override
    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String getPermission() {
        return permission;
    }
}

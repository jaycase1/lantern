package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.RoleLimit;

import java.util.List;


public interface RoleLimitService {

    /**
     * 添加角色限制记录
     * @param roleLimit
     */
    public Integer insertRoleLimit(RoleLimit roleLimit);

    /**
     * 更改角色限制记录
     * @param roleLimit
     */
    public Integer updateRoleLimit(RoleLimit roleLimit);

    /**
     * 删除角色限制记录
     * @param roleLimit
     */
    public Integer deleteRoleLimit(RoleLimit roleLimit);

    /**
     * 查询角色限制记录
     * @param roleLimit
     */
    public List<RoleLimit> queryRoleLimit(RoleLimit roleLimit);
}

package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.Role;

import java.util.List;


public interface RoleService {

    /**
     * 添加角色
     * @param role
     */
    public Integer insertRole(Role role);

    /**
     * 修改角色
     * @param role
     */
    public Integer updateRole(Role role);

    /**
     * 删除角色
     * @param role
     */
    public Integer deleteRole(Role role);

    /**
     * 查询角色
     * @param role
     */
    public List<Role> queryRole(Role role);
}

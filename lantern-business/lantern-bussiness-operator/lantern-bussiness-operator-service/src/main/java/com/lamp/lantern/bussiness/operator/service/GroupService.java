package com.lamp.lantern.bussiness.operator.service;
import com.lamp.lantern.bussiness.operator.entity.Group;

import java.util.List;


public interface GroupService {

    /**
     * 添加用户组
     * @param group
     */
    public Integer insertGroup(Group group);

    /**
     * 更改用户组
     * @param group
     */
    public Integer updateGroup(Group group);

    /**
     * 删除用户组
     * @param group
     */
    public Integer deleteGroup(Group group);

    /**
     * 查询用户组
     * @param group
     */
    public List<Group> queryGroup(Group group);


}

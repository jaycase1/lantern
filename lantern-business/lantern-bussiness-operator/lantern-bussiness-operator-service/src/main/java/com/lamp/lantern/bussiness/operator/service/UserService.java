package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.User;

import java.util.List;


public interface UserService {

    /**
    * 添加用户
    * @param user
    */
    public Integer insertUser(User user);

    /**
     * 修改用户
     * @param user
     */
    public Integer updateUser(User user);

    /**
     * 查询多个用户
     * @param user
     */
    public List<User> queryUser(User user);

    /**
     * 删除用户
     * @param user
     */
    public Integer deleteUser(User user);

}

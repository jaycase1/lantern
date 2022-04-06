package com.lamp.lantern.bussiness.operator.provider.service.impl;
import com.lamp.lantern.bussiness.operator.entity.User;
import com.lamp.lantern.bussiness.operator.provider.mapper.UserMapper;
import com.lamp.lantern.bussiness.operator.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> queryUser(User user) {
        return userMapper.queryUser(user);
    }

    @Override
    public Integer deleteUser(User user) {
        return userMapper.deleteUser(user);
    }

}

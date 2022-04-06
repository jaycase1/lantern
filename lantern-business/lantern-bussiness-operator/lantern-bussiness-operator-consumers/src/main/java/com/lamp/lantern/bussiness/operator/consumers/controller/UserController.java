package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.User;
import com.lamp.lantern.bussiness.operator.service.UserService;
import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


import java.util.List;



// 现在要完成的是User的增删改查


@Slf4j
@RequestMapping("/user")
@RestController("userController")
@Api(tags = {"用户操作接口"})
public class UserController {


    @Reference
    private UserService userService;

    @PostMapping("/insertUser")
    @ApiOperation(value = "添加用户")
    public ResultObject<String> insertUser(@RequestBody User user){
        System.out.println("jaycaseHaha");
        System.out.println("user + " + user.toString());
        System.out.println(userService == null);
        try {
            userService.insertUser(user);
        } catch (Exception e){
            log.warn("添加用户失败 {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/deleteUser")
    @ApiOperation(value = "删除用户")
    public ResultObject<String> deleteUser(@RequestBody User user){
        System.out.println("user is " + user.toString());
        try {
            userService.deleteUser(user);
        } catch (Exception e){
            log.warn("用户删除失败 {} ", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateUser")
    @ApiOperation(value="修改用户")
    public ResultObject<String> updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
        } catch (Exception e){
            log.warn("用户更改失败 {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/queryUsers")
    @ApiOperation(value = "查询用户")
    public List<User> queryUser(@RequestBody User user){
        try {
            return userService.queryUser(user);
        } catch (Exception e){
            log.warn("用户查询失败 {} ", e);
            return null;
        }
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello hahaha");
        return "hello world";
    }

}

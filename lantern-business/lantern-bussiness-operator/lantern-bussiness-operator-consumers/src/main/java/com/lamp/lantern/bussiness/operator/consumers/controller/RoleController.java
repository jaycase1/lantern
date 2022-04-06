package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.Role;
import com.lamp.lantern.bussiness.operator.entity.RoleLimit;
import com.lamp.lantern.bussiness.operator.service.RoleService;

import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/role")
@RestController("roleController")
@Api(tags = {"角色操作接口"})
public class RoleController {

    //@Reference
    private RoleService roleService;

    @PostMapping("/insertRole")
    @ApiOperation(value = "添加角色")
    public ResultObject<String> insertRole(@RequestBody Role role){
        try{
            roleService.insertRole(role);
        }catch (Exception e){
            log.warn("添加角色失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateRole")
    @ApiOperation(value = "更新角色")
    public ResultObject<String> updateRole(@RequestBody Role role){
        try{
            roleService.updateRole(role);
        }catch (Exception e){
            log.warn("更新角色失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/deleteRole")
    @ApiOperation(value = "删除角色")
    public ResultObject<String> deleteRole(@RequestBody Role role){
        try{
            roleService.deleteRole(role);
        }catch (Exception e){
            log.warn("删除角色失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }


    @PostMapping("/queryRole")
    @ApiOperation(value = "查询角色")
    public List<Role> queryRole(@RequestBody Role role){
        try{
            return roleService.queryRole(role);
        }catch (Exception e){
            log.warn("查询角色失败, {}", e);
            return null;
        }

    }

}

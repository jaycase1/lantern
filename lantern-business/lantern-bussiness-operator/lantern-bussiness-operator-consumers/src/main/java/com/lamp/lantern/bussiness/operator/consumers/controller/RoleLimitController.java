package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.RoleLimit;
import com.lamp.lantern.bussiness.operator.service.RoleLimitService;

import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/roleLimit")
@RestController("roleLimitController")
@Api(tags = {"角色限制操作接口"})
public class RoleLimitController {

    //@Reference
    private RoleLimitService roleLimitService;

    @PostMapping("/insertRoleLimit")
    @ApiOperation(value = "添加角色限制")
    public ResultObject<String> insertRoleLimit(@RequestBody RoleLimit roleLimit){
        try{
            roleLimitService.insertRoleLimit(roleLimit);
        }catch (Exception e){
            log.warn("添加角色限制失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateRoleLimit")
    @ApiOperation(value = "更新角色限制")
    public ResultObject<String> updateRoleLimit(@RequestBody RoleLimit roleLimit){
        try{
            roleLimitService.updateRoleLimit(roleLimit);
        }catch (Exception e){
            log.warn("更新角色限制失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }


    @PostMapping("/deleteRoleLimit")
    @ApiOperation(value = "删除角色限制")
    public ResultObject<String> deleteRoleLimit(@RequestBody RoleLimit roleLimit){
        try{
            roleLimitService.deleteRoleLimit(roleLimit);
        }catch (Exception e){
            log.warn("删除角色限制失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }


    @PostMapping("/queryRoleLimit")
    @ApiOperation(value = "查询角色限制")
    public List<RoleLimit> queryRoleLimit(@RequestBody RoleLimit roleLimit){
        try{
            return roleLimitService.queryRoleLimit(roleLimit);
        }catch (Exception e){
            log.warn("添加角色限制失败, {}", e);
            return null;
        }

    }
}

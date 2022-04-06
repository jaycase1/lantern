package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.Group;
import com.lamp.lantern.bussiness.operator.service.GroupService;
import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/group")
@RestController("groupController")
@Api(tags = {"用户组操作接口"})
public class GroupController {

    //@Reference
    private GroupService groupService;

    @PostMapping("/insertGroup")
    @ApiOperation(value = "添加用户组")
    public ResultObject<String> insertGroup(@RequestBody Group group){
        try{
            groupService.insertGroup(group);
        }catch (Exception e){
            log.warn("添加用户组失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/deleteGroup")
    @ApiOperation(value = "删除用户组")
    public ResultObject<String> deleteGroup(@RequestBody Group group){
        try{
            groupService.deleteGroup(group);
        }catch (Exception e){
            log.warn("删除用户组失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateGroup")
    @ApiOperation(value = "更改用户组")
    public ResultObject<String> updateGroup(@RequestBody Group group){
        try{
            groupService.updateGroup(group);
        }catch (Exception e){
            log.warn("更改用户组失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/queryGroup")
    @ApiOperation(value = "查询用户组")
    public List<Group> queryGroup(@RequestBody Group group){
        try{
            return groupService.queryGroup(group);
        }catch (Exception e){
            log.warn("添加用户组失败, {}", e);
            return null;
        }

    }

}

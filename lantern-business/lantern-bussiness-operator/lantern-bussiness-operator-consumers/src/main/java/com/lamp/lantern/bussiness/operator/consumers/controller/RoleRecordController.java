package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.RoleLimit;
import com.lamp.lantern.bussiness.operator.entity.RoleRecord;
import com.lamp.lantern.bussiness.operator.service.RoleRecordService;

import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/roleRecord")
@RestController("roleRecordController")
@Api(tags = {"角色记录操作接口"})
public class RoleRecordController {

    //@Reference
    private RoleRecordService roleRecordService;

    @PostMapping("/insertRoleRecord")
    @ApiOperation(value = "添加角色记录")
    public ResultObject<String> insertRoleRecord(@RequestBody RoleRecord roleRecord){
        try{
            roleRecordService.insertRoleRecord(roleRecord);
        }catch (Exception e){
            log.warn("添加角色记录失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateRoleRecord")
    @ApiOperation(value = "更新角色记录")
    public ResultObject<String> updateRoleRecord(@RequestBody RoleRecord roleRecord){
        try{
            roleRecordService.updateRoleRecord(roleRecord);
        }catch (Exception e){
            log.warn("更新角色记录失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/deleteRoleRecord")
    @ApiOperation(value = "删除角色记录")
    public ResultObject<String> deleteRoleRecord(@RequestBody RoleRecord roleRecord){
        try{
            roleRecordService.deleteRoleRecord(roleRecord);
        }catch (Exception e){
            log.warn("删除角色记录失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/queryRoleRecord")
    @ApiOperation(value = "查询角色记录")
    public List<RoleRecord> queryRoleRecord(@RequestBody RoleRecord roleRecord){
        try{
            return roleRecordService.queryRoleRecord(roleRecord);
        }catch (Exception e){
            log.warn("查询角色记录失败, {}", e);
            return null;
        }
    }
}

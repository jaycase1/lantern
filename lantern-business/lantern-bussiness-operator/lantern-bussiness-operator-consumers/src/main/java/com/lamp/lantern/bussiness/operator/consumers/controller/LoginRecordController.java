package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.LoginRecord;
import com.lamp.lantern.bussiness.operator.service.LoginRecordService;

import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/loginRecord")
@RestController("loginRecordController")
@Api(tags = {"登录记录操作接口"})
public class LoginRecordController {

    //@Reference
    private LoginRecordService loginRecordService;

    @PostMapping("/insertLoginRecord")
    @ApiOperation(value="添加登录记录")
    public ResultObject<String> insertLoginRecord(LoginRecord loginRecord){
        try{
            loginRecordService.insertLoginRecord(loginRecord);
        }catch (Exception e){
            log.warn("插入登录记录失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateLoginRecord")
    @ApiOperation(value="更新登录记录")
    public ResultObject<String> updateLoginRecord(LoginRecord loginRecord){
        try{
            loginRecordService.updateLoginRecord(loginRecord);
        }catch (Exception e){
            log.warn("更新登录记录失败, {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/queryLoginRecord")
    @ApiOperation(value="查询登录记录")
    public List<LoginRecord> queryLoginRecord(LoginRecord loginRecord){
        try{
            return loginRecordService.queryLoginRecord(loginRecord);
        }catch (Exception e){
            log.warn("插入登录记录失败, {}", e);
            return null;
        }
    }

}

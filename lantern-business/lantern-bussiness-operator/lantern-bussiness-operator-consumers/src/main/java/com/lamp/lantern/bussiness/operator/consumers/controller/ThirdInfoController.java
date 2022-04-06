package com.lamp.lantern.bussiness.operator.consumers.controller;

import com.lamp.lantern.bussiness.operator.entity.ThirdInfo;
import com.lamp.lantern.bussiness.operator.service.ThirdInfoService;

import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import com.lamp.decoration.core.result.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/thirdInfo")
@RestController("thridInfoController")
@Api(tags = {"第三方信息操作接口"})
public class ThirdInfoController {

    //@Reference
    private ThirdInfoService thirdInfoService;

    @PostMapping("/insertThirdInfo")
    @ApiOperation("添加第三方信息")
    public ResultObject<String> insertThirdInfo(ThirdInfo thirdInfo){
        try{
            thirdInfoService.insertThirdInfo(thirdInfo);
        }catch (Exception e){
            log.warn("插入第三方信息失败， {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/updateThirdInfo")
    @ApiOperation("更改第三方信息")
    public ResultObject<String> updateThirdInfo(ThirdInfo thirdInfo){
        try{
            thirdInfoService.updateThirdInfo(thirdInfo);
        }catch (Exception e){
            log.warn("插入第三方信息失败， {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/deleteThirdInfo")
    @ApiOperation("删除第三方信息")
    public ResultObject<String> deleteThirdInfo(ThirdInfo thirdInfo){
        try{
            thirdInfoService.deleteThirdInfo(thirdInfo);
        }catch (Exception e){
            log.warn("删除第三方信息失败， {}", e);
            return ResultObjectEnums.FAIL.getResultObject();
        }
        return ResultObjectEnums.SUCCESS.getResultObject();
    }

    @PostMapping("/queryThirdInfo")
    @ApiOperation("查询第三方信息")
    public List<ThirdInfo> queryThirdInfo(ThirdInfo thirdInfo){
        try{
            return thirdInfoService.queryThirdInfo(thirdInfo);
        }catch (Exception e){
            log.warn("查询第三方信息失败， {}", e);
            return null;
        }

    }

}

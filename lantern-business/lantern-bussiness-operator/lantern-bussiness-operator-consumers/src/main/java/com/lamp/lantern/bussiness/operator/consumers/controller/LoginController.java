package com.lamp.lantern.bussiness.operator.consumers.controller;


import com.lamp.decoration.core.result.ResultObject;
import com.lamp.lantern.bussiness.operator.consumers.utils.ResultObjectEnums;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping(value= "/input")
    @ResponseBody
    public String hello(){
        System.out.println("hello hahahaha");
        return "jaycase";
    }

    @PostMapping(value = "/test")
    @ApiOperation(value = "测试Post方法")
    @ResponseBody
    public ResultObject<String> add(String textOne, String textTwo){
        System.out.println("have in " + textOne + textTwo);
        ResultObject<String> success = ResultObjectEnums.SUCCESS.getResultObject();
        success.setData(textOne + textTwo);
        return success;
    }

}

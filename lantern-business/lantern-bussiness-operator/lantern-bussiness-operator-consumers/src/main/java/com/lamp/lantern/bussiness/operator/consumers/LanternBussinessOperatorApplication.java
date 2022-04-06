package com.lamp.lantern.bussiness.operator.consumers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableTransactionManagement
public class LanternBussinessOperatorApplication  {

    public static void main(String[] args){
        try{
            // 在这里报错
            System.out.println("yes");
            SpringApplication.run(LanternBussinessOperatorApplication.class, args);
            //log.info("{} 启动成功", LanternBussinessOperatorApplication.class.getSimpleName());
        }catch (Exception e){
            //log.error(e.getMessage(), e);
        }
    }
}

package com.lamp.lantern.bussiness.operator.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@EnableTransactionManagement
public class LanternBussinessOperatorProviderApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(LanternBussinessOperatorProviderApplication.class, args);
            log.info("{} 启动成功", LanternBussinessOperatorProviderApplication.class.getSimpleName());
        } catch (Exception e){
            log.error(e.getMessage(), e);
        }
    }
}

package com.sise.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName DeptConsumer808_App
 * @Description TODO
 * @Author zzr
 * @Date 2019/6/19 22:37
 * @Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.sise.springcloud"})
@ComponentScan("com.sise.springcloud")
public class DeptConsumer808_Feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer808_Feign_App.class, args);
    }
}
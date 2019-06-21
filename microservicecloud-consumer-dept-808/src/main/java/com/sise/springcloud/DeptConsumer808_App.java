package com.sise.springcloud;

import com.sise.springcloud.com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName DeptConsumer808_App
 * @Description TODO
 * @Author zzr
 * @Date 2019/6/19 22:37
 * @Version 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer808_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer808_App.class, args);
    }
}
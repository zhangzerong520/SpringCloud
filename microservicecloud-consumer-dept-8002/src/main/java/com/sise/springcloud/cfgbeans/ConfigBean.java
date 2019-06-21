package com.sise.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//springboot --> spring  applicationContext.xml
//@Configuration 配置 ConfigBean ==applicationContext.xml

@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

//    @Bean
//    public UserService getUserService(){
//        return new UserServiceImpl();
//    }
//    applicationContext.xml=ConfigBean(@Configuration)
//    <bean id="userService" class="com.sise.service.impl.UserServiceImpl>


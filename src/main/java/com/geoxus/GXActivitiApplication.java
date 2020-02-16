package com.geoxus;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableCaching
@EnableTransactionManagement
@EnableRabbit
@EnableAspectJAutoProxy
public class GXActivitiApplication {
    public static void main(String[] args) {
        SpringApplication.run(GXActivitiApplication.class, args);
    }
}
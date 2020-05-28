package com.yhl.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderConsumerApp_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerApp_80.class,args);
    }
}
package com.yhl.mscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMentApp8001 {

    public static void main(String[] args) {
        SpringApplication.run(PayMentApp8001.class, args);
    }
}

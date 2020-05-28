package com.yhl.consumer.controller;

import com.api.commons.entities.CommonResult;
import com.api.commons.entities.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Slf4j
public class OrderController {

    private final String PAYMENT_URL = "http://localhost:8001/payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/add")
    @ResponseBody
    public CommonResult<PayMent> add(PayMent payMent){
        String addURL = PAYMENT_URL+"/add/";
        log.info("--OrderController-- add --start-- {},{}",addURL,payMent);
        return restTemplate.postForObject(addURL,payMent,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    @ResponseBody
    public CommonResult<PayMent> getPayment(@PathVariable("id")Integer id){
        String getURL = PAYMENT_URL+"/get/"+id;
        log.info("--OrderController-- getPayment --start-- {}",getURL);
        return restTemplate.getForObject(getURL,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get")
    @ResponseBody
    public CommonResult getAllPayment(){
        String getURL = PAYMENT_URL+"/get";
        log.info("--OrderController-- getPayment --start-- {}",getURL);
        return restTemplate.getForObject(getURL,CommonResult.class);
    }
}

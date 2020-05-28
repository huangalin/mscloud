package com.yhl.mscloud.controller;

import com.api.commons.entities.CommonResult;
import com.api.commons.entities.PayMent;
import com.yhl.mscloud.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
public class PayMentController {
    @Autowired
    private PayMentService payMentService;

    @PostMapping(value = "/payment/add")
    @ResponseBody
    public CommonResult add(@RequestBody PayMent payMent) {
        log.info("服务端PayMentController 插入数据 start ==> {}",payMent);
        int result = payMentService.add(payMent);
        if(result <= 0){
            return new CommonResult("444","添加失败！",null);
        }
        log.info("插入数据成功！{}",payMent);
        return new CommonResult("200","添加成功！",payMent);
    }

    @GetMapping(value = "/payment/get/{id}")
    @ResponseBody
    public CommonResult findById(@PathVariable("id") Integer id) {
        PayMent payMent = payMentService.findById(id);
        log.info("操作成功！{}",payMent);
        if(payMent == null){
            return new CommonResult("403","未查询到相关数据！",null);
        }
        return new CommonResult("200","成功！",payMent);
    }

    @GetMapping(value = "/payment/get")
    @ResponseBody
    public CommonResult findAll(){
        List<PayMent> payMents = payMentService.findAll();
        log.info("操作成功！{}",payMents);
        if(payMents.size() == 0){
            return new CommonResult("403","未查询到相关数据！",null);
        }
        return new CommonResult("200","成功！",payMents);
    }
}

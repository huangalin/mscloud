package com.yhl.mscloud.service;

import com.api.commons.entities.PayMent;

import java.util.List;

public interface PayMentService {
    public int add(PayMent payMent);

    public PayMent findById(Integer id);

    public List<PayMent> findAll();
}

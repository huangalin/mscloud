package com.yhl.mscloud.service.impl;

import com.api.commons.entities.PayMent;
import com.yhl.mscloud.dao.PayMentDao;
import com.yhl.mscloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayMentServiceImpl implements PayMentService {

//    @Resource
    @Autowired
    private PayMentDao pmdao;

    @Override
    public int add(PayMent payMent) {
        return pmdao.add(payMent);
    }

    @Override
    public PayMent findById(Integer id) {
        return pmdao.findById(id);
    }

    @Override
    public List<PayMent> findAll() {
        return pmdao.findAll();
    }
}

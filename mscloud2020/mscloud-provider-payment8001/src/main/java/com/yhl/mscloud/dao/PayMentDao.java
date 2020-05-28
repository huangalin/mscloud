package com.yhl.mscloud.dao;

import com.api.commons.entities.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
@Mapper
public interface PayMentDao {

    public int add(PayMent payMent);

    public PayMent findById(@Param("id")Integer id);

    public List<PayMent> findAll();
}

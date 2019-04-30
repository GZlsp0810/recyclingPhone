package com.qianfeng.price.service;

import com.qianfeng.price.po.Basinfo;
import com.qianfeng.price.vo.PriceList;

import java.util.List;

public interface Ipricezhekou {

    PriceList queryprice(String sub, Integer phoneId);
    List<Basinfo> querybasinfo(String sub);
}

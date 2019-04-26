package com.qianfeng.price.service;

import com.qianfeng.list.po.Phone;
import com.qianfeng.price.po.Fucphone;
import com.qianfeng.price.vo.PriceList;

import java.util.List;

public interface Ipricezhekou {

    PriceList queryprice(String sub, Integer phoneId);
}

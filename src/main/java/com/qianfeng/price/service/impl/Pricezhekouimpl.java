package com.qianfeng.price.service.impl;

import com.qianfeng.list.mapper.PhoneMapper;
import com.qianfeng.list.po.Phone;
import com.qianfeng.price.mapper.PriceMapper;
import com.qianfeng.price.po.Basinfo;
import com.qianfeng.price.po.Fucphone;
import com.qianfeng.price.service.Ipricezhekou;
import com.qianfeng.price.vo.PriceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pricezhekouimpl implements Ipricezhekou {
    @Autowired
    private PriceMapper priceMapper;
    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public PriceList queryprice(String sub, Integer phoneId) {
        Phone phone = phoneMapper.queryByphoneId(phoneId);
        int costprice=phone.getPrice();
        String [] prices=sub.split("-");
        List<Fucphone> fucphoneList = priceMapper.querybyidprice(prices);

         int a=0;
        for (Fucphone p:fucphoneList
             ) {
            a+=p.getWeight();
        }
        int newprice =costprice-a;
        PriceList priceList = new PriceList();
        priceList.setNewPrice(newprice);
        priceList.setImg(phone.getImg());

        return priceList;
    }

    @Override
    public  List<Basinfo> querybasinfo(String sub) {
        String [] prices=sub.split("-");
        List<Basinfo> basinfos = priceMapper.querbasinfo(prices);
        return basinfos ;
    }

}

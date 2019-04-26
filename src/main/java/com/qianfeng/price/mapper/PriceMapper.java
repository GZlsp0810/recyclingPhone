package com.qianfeng.price.mapper;

import com.qianfeng.list.po.Phone;
import com.qianfeng.price.po.Fucphone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriceMapper {
//    Phone querybyidprice(@Param("fpId") Integer fpId);
    List<Fucphone> querybyidprice(String[] prices);
}

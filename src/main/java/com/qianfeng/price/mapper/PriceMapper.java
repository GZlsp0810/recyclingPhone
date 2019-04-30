package com.qianfeng.price.mapper;

import com.qianfeng.list.po.Phone;
import com.qianfeng.price.po.Basinfo;
import com.qianfeng.price.po.Fucphone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PriceMapper {
    List<Fucphone> querybyidprice(String[] prices);
    List<Basinfo> querbasinfo(String[] basinfo);
}

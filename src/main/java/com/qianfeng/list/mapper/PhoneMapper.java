package com.qianfeng.list.mapper;

import com.qianfeng.list.po.Phone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneMapper {
    List<Phone> findallphone();
    List<Phone> queryBytypeId(@Param("typeId") Integer typeId);
}

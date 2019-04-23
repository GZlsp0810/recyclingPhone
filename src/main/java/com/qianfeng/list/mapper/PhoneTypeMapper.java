package com.qianfeng.list.mapper;

import com.qianfeng.list.po.PhoneType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneTypeMapper {
    List<PhoneType> findalltype();
}

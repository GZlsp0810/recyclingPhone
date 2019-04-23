package com.qianfeng.list.service.impl;

import com.qianfeng.list.mapper.PhoneTypeMapper;
import com.qianfeng.list.po.PhoneType;
import com.qianfeng.list.service.IphoneTypelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneTypelistServiceimpl implements IphoneTypelistService {
    @Autowired
    private PhoneTypeMapper typeMapper;

    @Override
    public List<PhoneType> findalltype() {
        List<PhoneType> typeList = typeMapper.findalltype();
        return typeList;
    }
}

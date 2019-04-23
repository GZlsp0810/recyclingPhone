package com.qianfeng.list.service;

import com.qianfeng.list.po.Phone;

import java.util.List;

public interface IphonelistService {
    List<Phone> findallphone();
    List<Phone> queryBytypeId(Integer typeId);
}

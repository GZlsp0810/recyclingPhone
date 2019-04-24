package com.qianfeng.list.service;

import com.qianfeng.list.po.Phone;
import com.qianfeng.list.vo.PhonemsgVo;

import java.util.List;

public interface IphonelistService {
    List<Phone> findallphone();
    List<Phone> queryBytypeId(Integer typeId);
    Phone queryByphoneId(Integer phoneId);
    List<PhonemsgVo> queryphonevoById(Integer phoneId);
}

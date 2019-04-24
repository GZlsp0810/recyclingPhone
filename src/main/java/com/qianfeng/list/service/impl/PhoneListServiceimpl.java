package com.qianfeng.list.service.impl;

import com.qianfeng.list.mapper.PhoneMapper;
import com.qianfeng.list.po.Phone;
import com.qianfeng.list.service.IphonelistService;
import com.qianfeng.list.vo.PhonemsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneListServiceimpl  implements IphonelistService {
    @Autowired
    private PhoneMapper phoneMapper;
    @Override
    public List<Phone> findallphone() {
        List<Phone> phoneList = phoneMapper.findallphone();
        return phoneList;
    }

    @Override
    public List<Phone> queryBytypeId(Integer typeId) {
        List<Phone> phones = phoneMapper.queryBytypeId(typeId);
        return phones;
    }

    @Override
    public Phone queryByphoneId(Integer phoneId) {
        Phone phone = phoneMapper.queryByphoneId(phoneId);
        return phone;
    }

    @Override
    public List<PhonemsgVo> queryphonevoById(Integer phoneId) {
        List<PhonemsgVo> phonemsgVoList = phoneMapper.queryphonevoById(phoneId);
        return phonemsgVoList;
    }


}

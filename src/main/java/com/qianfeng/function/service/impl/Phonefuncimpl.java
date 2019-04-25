package com.qianfeng.function.service.impl;

import com.qianfeng.function.mapper.PhonefunMapper;
import com.qianfeng.function.service.Iphonefunc;
import com.qianfeng.function.vo.PhonebasinfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Phonefuncimpl implements Iphonefunc {
    @Autowired
    private PhonefunMapper phonefunMapper;
    @Override
    public List<PhonebasinfoVo> queryPhonefuncList(Integer phoneId) {
//        List<PhonebasVo> phoneFunListVOS  = new ArrayList<>();
//        PhonebasVo funListVO = new PhonebasVo();
//        PhonebasVo funListVO1 = new PhonebasVo();
//        PhonebasVo funListVO2 = new PhonebasVo();
//        funListVO.setPhonebasinfoVoList(phonefunMapper.queryPhonefuncList(phoneId,111));
//        funListVO1.setPhonebasinfoVoList(phonefunMapper.queryPhonefuncList(phoneId,222));
//        funListVO2.setPhonebasinfoVoList(phonefunMapper.queryPhonefuncList(phoneId,333));
//        phoneFunListVOS.add(funListVO);
//        phoneFunListVOS.add(funListVO1);
//        phoneFunListVOS.add(funListVO2);
       // return phoneFunListVOS;

        List<PhonebasinfoVo> phonebasinfoVos = phonefunMapper.queryPhonefuncList(phoneId);

                                return phonebasinfoVos;
    }

    public List<PhonebasinfoVo>queryPhonefuncLists(Integer phoneId){
        List<PhonebasinfoVo> phonebasinfoVos = phonefunMapper.queryPhonefuncLists(phoneId);
           return phonebasinfoVos;
    }

    public List<PhonebasinfoVo>queryPhonefuncListst(Integer phoneId){
        List<PhonebasinfoVo> phonebasinfoVos = phonefunMapper.queryPhonefuncListst(phoneId);
        return phonebasinfoVos;
    }

    public List<PhonebasinfoVo>queryfuncfour(Integer phoneId){
        List<PhonebasinfoVo> phonebasinfoVos = phonefunMapper.queryPhonefuncListfuor(phoneId);
        return phonebasinfoVos;
    }
}

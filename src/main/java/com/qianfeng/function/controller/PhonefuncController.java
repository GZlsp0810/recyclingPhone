package com.qianfeng.function.controller;

import com.qianfeng.function.service.impl.Phonefuncimpl;
import com.qianfeng.function.vo.PhonebasinfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin
@Controller
public class PhonefuncController {
    @Autowired
    private Phonefuncimpl phonefuncimpl;
    @ResponseBody
    @RequestMapping("func")
    public List<PhonebasinfoVo> queryPhonefuncList(Integer phoneId){
        List<PhonebasinfoVo> funListVOS = phonefuncimpl.queryPhonefuncList(phoneId);
        return funListVOS;
    }
    @ResponseBody
    @RequestMapping("funcs")
    public List<PhonebasinfoVo> queryPhonefuncLists(Integer phoneId){
        List<PhonebasinfoVo> lists = phonefuncimpl.queryPhonefuncLists(phoneId);
                return lists;
    }

    @ResponseBody
    @RequestMapping("fust")
    public List<PhonebasinfoVo> queryPhonefuncListst(Integer phoneId){
        List<PhonebasinfoVo> lists = phonefuncimpl.queryPhonefuncListst(phoneId);
        return lists;
    }

    @ResponseBody
    @RequestMapping("fustd")
    public List<PhonebasinfoVo> queryPhonefuncListstd(Integer phoneId){
        List<PhonebasinfoVo> lists = phonefuncimpl.queryfuncfour(phoneId);
        return lists;
    }
}

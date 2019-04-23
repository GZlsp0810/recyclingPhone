package com.qianfeng.list.controller;


import com.qianfeng.list.po.PhoneType;
import com.qianfeng.list.service.impl.PhoneTypelistServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class TypePhoneController {
    @Autowired
    private PhoneTypelistServiceimpl typelistServiceimpl;
    @ResponseBody
    @RequestMapping("type")
    public List<PhoneType> findalltype(){
        List<PhoneType> typeList = typelistServiceimpl.findalltype();
        return typeList;
    }
}

package com.qianfeng.list.controller;

import com.qianfeng.list.po.Phone;
import com.qianfeng.list.service.IphonelistService;
import com.qianfeng.list.service.impl.PhoneListServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin
@Controller
public class PhoneController {
    @Autowired
   private PhoneListServiceimpl serviceimpl;
    @ResponseBody
    @RequestMapping("listphone")
    public List<Phone> alllistPhone(){
        List<Phone> phoneList = serviceimpl.findallphone();
        return phoneList;
    }
   @ResponseBody
    @RequestMapping("query")
    public List<Phone> queryBytypeId(Integer typeId){
        List<Phone> phones = serviceimpl.queryBytypeId(typeId);
        return phones;
    }
}

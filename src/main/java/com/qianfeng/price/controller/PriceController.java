package com.qianfeng.price.controller;

import com.qianfeng.list.po.Phone;
import com.qianfeng.list.service.impl.PhoneListServiceimpl;
import com.qianfeng.price.po.Fucphone;
import com.qianfeng.price.service.impl.Pricezhekouimpl;
import com.qianfeng.price.vo.JsonResultVo;
import com.qianfeng.price.vo.PriceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class PriceController {
    @Autowired
    private PhoneListServiceimpl listServiceimpl;
    @Autowired
 private Pricezhekouimpl pricezhekouimpl;
    JsonResultVo resultVo = new JsonResultVo();


    @ResponseBody
    @RequestMapping(value = "price/{sub}/{phoneId}",method = RequestMethod.GET)
    public PriceList pricezhekou( @PathVariable("sub") String sub, @PathVariable("phoneId") Integer phoneId){
        PriceList priceList = pricezhekouimpl.queryprice(sub, phoneId);

        resultVo.setSub(sub);
        resultVo.setPhoneId(phoneId);
        resultVo.setImg(priceList.getImg());
        resultVo.setNewPrice(priceList.getNewPrice());
        return priceList;
    }
    @ResponseBody
    @RequestMapping("js")
     public JsonResultVo getprice(){
        return resultVo;
     }
}

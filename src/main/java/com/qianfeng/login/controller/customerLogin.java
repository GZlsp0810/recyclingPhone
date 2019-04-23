package com.qianfeng.login.controller;

import com.qianfeng.login.exception.PasswordErrorException;
import com.qianfeng.login.exception.UsernameNotFoundException;
import com.qianfeng.login.po.Customer;
import com.qianfeng.login.service.impl.customerServiceimpl;
import com.qianfeng.login.vo.JsonResultVO;
import com.qianfeng.login.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class customerLogin {
    @Autowired
    private customerServiceimpl customerServiceimpl;
    @ResponseBody
    @PostMapping("login")
    public JsonResultVO loginAjax(LoginInfoVO loginInfoVO, HttpSession session){
        JsonResultVO jsonResultVO = new JsonResultVO();
        try {
            Customer customer = customerServiceimpl.login(loginInfoVO);
            session.setAttribute("customer",customer);
            jsonResultVO.setCode(1);
        } catch (NullPointerException e){
            e.printStackTrace();

            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请输入用户名");
        } catch (UsernameNotFoundException | PasswordErrorException e) {
            e.printStackTrace();

            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("用户名或者密码错误");
        } catch (Exception e) {
            e.printStackTrace();

            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("请联系管理员");
        }
        return jsonResultVO;
    }
}

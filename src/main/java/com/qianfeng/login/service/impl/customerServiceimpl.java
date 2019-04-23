package com.qianfeng.login.service.impl;

import com.qianfeng.login.exception.PasswordErrorException;
import com.qianfeng.login.exception.UsernameNotFoundException;
import com.qianfeng.login.mapper.CustomerMapper;
import com.qianfeng.login.po.Customer;
import com.qianfeng.login.service.IcustomerService;
import com.qianfeng.login.untils.MD5Utils;
import com.qianfeng.login.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerServiceimpl implements IcustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Customer login(LoginInfoVO loginInfoVO) throws Exception {
        if (loginInfoVO == null) {
            throw new NullPointerException("param is null");
        }
        String username = loginInfoVO.getUsername();
        String password = loginInfoVO.getPassword();
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }

        //1、检验用户名在数据库是否存在
        Customer customer = customerMapper.queryBycustName(username);
        if (customer == null) {
            throw new UsernameNotFoundException();
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密
        String passwordSalt = customer.getCustName();
        String md5Password = MD5Utils.md5(password, passwordSalt);
        //b、同数据库的密文进行对比
        if (!md5Password.equals(customer.getCustPwd())){
            throw new PasswordErrorException("password is error");
        }


        return customer;

    }
}

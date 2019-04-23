package com.qianfeng.login.service;

import com.qianfeng.login.po.Customer;
import com.qianfeng.login.vo.LoginInfoVO;


public interface IcustomerService {
    Customer login( LoginInfoVO loginInfoVO) throws Exception;
}

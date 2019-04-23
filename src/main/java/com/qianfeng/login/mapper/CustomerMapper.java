package com.qianfeng.login.mapper;

import com.qianfeng.login.po.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {
  Customer queryBycustName(@Param("custName") String custName);

}

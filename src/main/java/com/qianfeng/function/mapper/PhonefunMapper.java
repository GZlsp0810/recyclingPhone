package com.qianfeng.function.mapper;

import com.qianfeng.function.vo.PhonebasinfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhonefunMapper {
   // List<PhonebasinfoVo> queryPhonefuncList(@Param("phoneId") Integer phoneId, @Param("bigId") Integer bigId);
    List<PhonebasinfoVo> queryPhonefuncList(@Param("phoneId") Integer phoneId);
    List<PhonebasinfoVo> queryPhonefuncLists(@Param("phoneId") Integer phoneId);
    List<PhonebasinfoVo> queryPhonefuncListst(@Param("phoneId") Integer phoneId);
    List<PhonebasinfoVo> queryPhonefuncListfuor(@Param("phoneId") Integer phoneId);
}

package com.qianfeng.function.vo;

import java.util.List;

public class PhonebasVo {
    private int basId;
    private String attribute;
    private List<PhonebasinfoVo> phonebasinfoVoList;

    public int getBasId() {
        return basId;
    }

    public void setBasId(int basId) {
        this.basId = basId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public List<PhonebasinfoVo> getPhonebasinfoVoList() {
        return phonebasinfoVoList;
    }

    public void setPhonebasinfoVoList(List<PhonebasinfoVo> phonebasinfoVoList) {
        this.phonebasinfoVoList = phonebasinfoVoList;
    }
}


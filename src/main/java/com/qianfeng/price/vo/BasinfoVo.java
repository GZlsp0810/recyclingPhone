package com.qianfeng.price.vo;

import com.qianfeng.price.po.Basinfo;

import java.util.List;

public class BasinfoVo {
    private  String sub;
    private int phoneId;
    private Integer newPrice;
    private String img;
    private String describes;
    private List<Basinfo> basinfo;

    public List<Basinfo> getBasinfo() {
        return basinfo;
    }

    public void setBasinfo(List<Basinfo> basinfo) {
        this.basinfo = basinfo;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public Integer getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Integer newPrice) {
        this.newPrice = newPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }
}

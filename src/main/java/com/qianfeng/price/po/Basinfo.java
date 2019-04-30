package com.qianfeng.price.po;


import com.qianfeng.price.vo.BasinfoVo;

public class Basinfo {

  private long basinfoId;
  private String describes;
  private String detailed;
  private long basId;
  private BasinfoVo basinfoVo;

  public BasinfoVo getBasinfoVo() {
    return basinfoVo;
  }

  public void setBasinfoVo(BasinfoVo basinfoVo) {
    this.basinfoVo = basinfoVo;
  }

  public long getBasinfoId() {
    return basinfoId;
  }

  public void setBasinfoId(long basinfoId) {
    this.basinfoId = basinfoId;
  }


  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }


  public String getDetailed() {
    return detailed;
  }

  public void setDetailed(String detailed) {
    this.detailed = detailed;
  }


  public long getBasId() {
    return basId;
  }

  public void setBasId(long basId) {
    this.basId = basId;
  }

}

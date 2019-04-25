package com.qianfeng.function.vo;

import java.util.List;

public class PhoneFunListVO {
   private String attribute;
   private int basId;
   private int  basinfoId;
   private  String detailed;
   private String describes;
   private double weighet;
   private int phoneId;
  private List<PhonebasVo> phonebasVoList;

   public List<PhonebasVo> getPhonebasVoList() {
      return phonebasVoList;
   }

    public void setPhonebasVoList(List<PhonebasVo> phonebasVoList) {
        this.phonebasVoList = phonebasVoList;
    }

    public String getAttribute() {
      return attribute;
   }

   public void setAttribute(String attribute) {
      this.attribute = attribute;
   }

   public int getBasId() {
      return basId;
   }

   public void setBasId(int basId) {
      this.basId = basId;
   }

   public int getBasinfoId() {
      return basinfoId;
   }

   public void setBasinfoId(int basinfoId) {
      this.basinfoId = basinfoId;
   }

   public String getDetailed() {
      return detailed;
   }

   public void setDetailed(String detailed) {
      this.detailed = detailed;
   }

   public String getDescribes() {
      return describes;
   }

   public void setDescribes(String describes) {
      this.describes = describes;
   }

   public double getWeighet() {
      return weighet;
   }

   public void setWeighet(double weighet) {
      this.weighet = weighet;
   }

   public int getPhoneId() {
      return phoneId;
   }

   public void setPhoneId(int phoneId) {
      this.phoneId = phoneId;
   }
}

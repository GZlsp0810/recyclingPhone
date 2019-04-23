package com.qianfeng.list.po;


public class Phone {

  private long phoneId;
  private String creator;
  private java.sql.Timestamp endTime;
  private String img;
  private String mobileName;
  private String modifier;
  private java.sql.Timestamp startTime;
  private long typeId;
  private double price;


  public long getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(long phoneId) {
    this.phoneId = phoneId;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public String getMobileName() {
    return mobileName;
  }

  public void setMobileName(String mobileName) {
    this.mobileName = mobileName;
  }


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}

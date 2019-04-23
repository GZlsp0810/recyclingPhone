package com.qianfeng.login.po;


public class Customer {

  private long custId;
  private String custName;
  private String custPwd;


  public long getCustId() {
    return custId;
  }

  public void setCustId(long custId) {
    this.custId = custId;
  }


  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }


  public String getCustPwd() {
    return custPwd;
  }

  public void setCustPwd(String custPwd) {
    this.custPwd = custPwd;
  }

}

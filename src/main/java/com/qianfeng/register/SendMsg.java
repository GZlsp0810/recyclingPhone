package com.qianfeng.register;

import java.util.Random;

public class SendMsg {

    /**
     * 发送短信验证码
     * @param number接收手机号码
     */
    @Requses("/sendSms")
    @ResponseBody
    public Object sendSms(HttpServletRequest request, String number) {
        try {
            JSONObject json = null;
            //生成6位验证码
            String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
            //发送短信
            ZhenziSmsClient client = new ZhenziSmsClient("你的appId", "你的appSecret");
            String result = client.send(number, "您的验证码为:" + verifyCode + "，该码有效期为5分钟，该码只能使用一次！【短信签名】");
            json = JSONObject.parseObject(result);
            if(json.getIntValue("code") != 0)//发送短信失败
                return "fail";
            //将验证码存到session中,同时存入创建时间
            //以json存放，这里使用的是阿里的fastjson
            HttpSession session = request.getSession();
            json = new JSONObject();
            json.put("verifyCode", verifyCode);
            json.put("createTime", System.currentTimeMillis());
            // 将认证码存入SESSION
            request.getSession().setAttribute("verifyCode", json);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

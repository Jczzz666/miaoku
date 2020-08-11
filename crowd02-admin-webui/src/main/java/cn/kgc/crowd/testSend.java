package cn.kgc.crowd;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class testSend {
    public static void main(String[] args) {

                    //生成验证码
                    String verifyCode = RandomUtil.getCode();
                    //邮件主题
                    String emailTitle = "邮箱验证";
                    //邮件内容
                    String emailContent = "您正在进行邮箱验证，您的验证码为：" + verifyCode + "，请于5分钟内完成验证！";
                    //发送邮件
        try {
            SendMailUtil.sendEmail("1511013989@qq.com", emailTitle, emailContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //缓存5分钟


            }

        }


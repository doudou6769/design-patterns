package com.doudou.structural.facade;

/**
 * <pre>
 * 说   明：外观类 用户主要和该类对象进行交互
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 根据语音操作家电 用户使用语音操作 而 不必关注子系统的操作细节
    public void say(String msg){
        if("打开".equals(msg)){
            on();
        }else if("关闭".equals(msg)){
            off();
        }else{
            System.out.println("听不懂");
        }
    }

    // 一键打开
    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    // 一键关闭
    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }

}

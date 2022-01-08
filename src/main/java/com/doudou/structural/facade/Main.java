package com.doudou.structural.facade;

/**
 * <pre>
 * 说   明：外观模式
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开");
    }

}

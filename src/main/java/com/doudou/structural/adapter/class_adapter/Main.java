package com.doudou.structural.adapter.class_adapter;

/**
 * <pre>
 * 说   明：类适配器模式
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        // 直接读取SD卡
        System.out.println(computer.readSD(new SDCardImpl()));

        // 通过适配器读取TF卡
        System.out.println(computer.readSD(new SDAdapterTF()));
    }

}

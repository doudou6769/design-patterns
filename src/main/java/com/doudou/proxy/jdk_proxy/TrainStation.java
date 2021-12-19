package com.doudou.proxy.jdk_proxy;

/**
 * <pre>
 * 说   明：代理的目标对象
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        // 原卖票方法
        System.out.println("火车站卖票");
    }

}
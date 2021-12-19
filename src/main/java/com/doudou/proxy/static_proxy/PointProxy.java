package com.doudou.proxy.static_proxy;

/**
 * <pre>
 * 说   明：火车票代售点
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class PointProxy implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    // 代理方法在不改变原火车站售票方法的同时 增强了原方法的功能（收取服务费）
    @Override
    public void sell() {
        // 添加前置增强方法
        System.out.println("代售点收取服务费");
        // 执行火车站的售票方法
        trainStation.sell();
        // 添加后置增强方法
        System.out.println("代售点记录");
    }

}

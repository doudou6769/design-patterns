package com.doudou.proxy.static_proxy;

/**
 * <pre>
 * 说   明：静态代理方法
 *         优点：不改变原方法的同时 增强了原方法功能
 *         缺点：如果需要对多个方法进行统一增强 需要逐一实现增强方法
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建待售点对象
        SellTickets sellTickets = new PointProxy();
        // 执行代理方法
        sellTickets.sell();
    }

}

package com.doudou.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * <pre>
 * 说   明：代理工厂 产出JDK代理对象
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject(){
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),   // 给定类加载器
                trainStation.getClass().getInterfaces(),    // 给定需要代理的接口 JDK基于接口代理
                (proxy, method, args) -> {                  // 给定代理方法的实现
                    // 给定代理方法实现
                    System.out.println("售票点收取服务费用");
                    // 执行火车站的售票方法
                    Object invoke = method.invoke(trainStation, args);
                    // 添加后置增强方法
                    System.out.println("代售点记录");
                    return invoke;
                }
        );
    }

}

package com.doudou.structural.proxy.jdk_proxy;

/**
 * <pre>
 * 说   明：JDK动态代理
 *         优点：相对于静态代理方式  如果接口新增了方法 对原代码无任何印象 可以统一实现对代理接口下的所有方法进行增强
 *         缺点：目标对象（车站）必须实现固定的接口（售票） 因为JDK基于接口进行动态代理
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建代理对象工厂  以产出代理（代售点）对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代售点对象
        SellTickets object = proxyFactory.getProxyObject();
        // 执行卖票方法
        object.sell();
    }

}

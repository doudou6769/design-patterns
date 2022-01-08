package com.doudou.structural.proxy.cglib_proxy;

/**
 * <pre>
 * 说   明：CGLIB动态代理 基于继承子类方式实现动态代理
 *         优点：不需要目标代理对象实现接口
 *         缺点：目标代理对象或方法被final修饰时不可用
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
        TrainStation proxyObject = proxyFactory.getProxyObject();
        // 执行卖票方法
        proxyObject.sell();
    }

}

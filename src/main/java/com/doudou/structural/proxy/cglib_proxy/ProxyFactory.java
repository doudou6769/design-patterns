package com.doudou.structural.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <pre>
 * 说   明：代理工厂
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class ProxyFactory implements MethodInterceptor {

    // 获取代理对象
    public TrainStation getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        return (TrainStation) enhancer.create();
    }

    /**
     * @param o 目标代理对象
     * @param method 目标方法
     * @param objects 目标方法参数
     * @param methodProxy 代理对象中的方法的method实例
     * @return java.lang.Object
     **/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 给定代理方法实现
        System.out.println("售票点收取服务费用");
        // 执行火车站的售票方法
        Object invoke = methodProxy.invokeSuper(o, objects);
        // 添加后置增强方法
        System.out.println("代售点记录");
        return invoke;
    }

}

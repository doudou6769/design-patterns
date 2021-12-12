package com.doudou.singleton;

/**
 * <pre>
 * 说   明：静态内部类方式 懒加载 且 JVM保证单例
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class StaticInnerClass {

    // 构造函数私有化
    private StaticInnerClass(){};

    // 静态内部类 单例对象持有者 外部类加载时 内部类不会加载
    private static class ClassHolder{
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    // 获取单例对象方法
    public static StaticInnerClass getInstance(){
        // 调用方法时 进行内部类的加载 内部类加载时 初始化外部类的实例对象 并返回 此过程由JVM保证单例
        return ClassHolder.INSTANCE;
    }

    // 其他业务方法
    public void method(){
        System.out.println("方法执行");
    }

}

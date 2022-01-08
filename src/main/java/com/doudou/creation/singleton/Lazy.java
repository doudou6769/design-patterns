package com.doudou.creation.singleton;

/**
 * <pre>
 * 说   明：懒汉式 使用时再加载
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Lazy {

    // 单例对象
    private static volatile Lazy instance;

    // 构造函数私有化
    private Lazy(){};

    // 获取单例对象
    public static Lazy getInstance(){
        // 第一层判断：当实例化完成后 不参与锁的竞争 保证方法执行效率
        if(instance == null){
            // 加锁 保证创建实例时线程安全
            synchronized (Lazy.class){
                // 第二层判断：保证最开始实例化时 多个线程都在24行等待锁对象 当第一个获得锁对象的线程完成实例化后
                // 后续线程拿到锁以后 如果不判断实例是否存在就直接创建实例的话 会造成创建多个实例对象出来
                if(instance == null){
                    instance = new Lazy();
                }
            }
        }
        return instance;
    }

    // 其他业务方法
    public void method(){
        System.out.println("方法执行");
    }

}

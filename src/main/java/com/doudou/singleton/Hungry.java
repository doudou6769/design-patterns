package com.doudou.singleton;

/**
 * <pre>
 * 说   明：饿汉式
 *         类加载到内存后，就建立一个实例，JVM保证线程安全
 *         缺点：不管用到与否，都会在类加载的时候实例化
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Hungry {

    // 类加载时实例化对象
    private static final Hungry INSTANCE = new Hungry();

    // 构造函数私有化
    private Hungry(){};

    // 返回单例对象
    public static Hungry getInstance() {
        return INSTANCE;
    }

    // 其他业务方法
    public void method(){
        System.out.println("方法执行");
    }

}

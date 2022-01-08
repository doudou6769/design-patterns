package com.doudou.creation.singleton;

/**
 * <pre>
 * 说   明：枚举单例 JVM保证线程安全
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public enum EnumMethod {
    // 单例
    INSTANCE;

    // 其他业务方法
    public void method(){
        System.out.println("方法执行");
    }

}

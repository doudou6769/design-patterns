package com.doudou.creation.factory.abstractfactory;

/**
 * <pre>
 * 说   明：魔法世界的交通工具（产品族中的产品）
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Broom implements Vehicle {
    @Override
    public void go() {
        System.out.println("扫帚");
    }
}

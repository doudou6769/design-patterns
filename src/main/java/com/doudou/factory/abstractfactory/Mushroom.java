package com.doudou.factory.abstractfactory;


/**
 * <pre>
 * 说   明：魔法世界的食物（产品族中的产品）
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Mushroom implements Food {
    @Override
    public void printName() {
        System.out.println("蘑菇");
    }
}

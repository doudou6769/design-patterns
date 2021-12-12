package com.doudou.factory.factorymethod;

/**
 * <pre>
 * 说   明：产品食物的具体实现 面包
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Bread implements Food{

    @Override
    public void printName() {
        System.out.println("面包");
    }

}

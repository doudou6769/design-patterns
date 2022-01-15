package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：猫（具体元素）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Cat implements Animal{

    // 具体访问方法
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵喵喵。。。");
    }

}

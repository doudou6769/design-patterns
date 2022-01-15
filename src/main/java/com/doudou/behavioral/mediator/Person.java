package com.doudou.behavioral.mediator;

/**
 * <pre>
 * 说   明：抽象同事类
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public abstract class Person {

    protected String name;          // 姓名
    protected Mediator mediator;    // 中介者对象

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}

package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：抽象访问者
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public interface Person {

    // 定义访问者访问猫的方法
    void feed(Cat cat);

    // 定义访问者访问狗的方法
    void feed(Dog dog);

}

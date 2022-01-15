package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：抽象元素
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public interface Animal {

    // 定义具体元素接受访问者进行访问
    void accept(Person person);

}

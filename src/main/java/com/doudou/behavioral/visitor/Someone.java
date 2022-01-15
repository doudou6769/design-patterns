package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：其他人（另一个具体访问者）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Someone implements Person{
    // 其他人访问猫的方法
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
    }

    // 其他人访问狗的方法
    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂猫");
    }

}

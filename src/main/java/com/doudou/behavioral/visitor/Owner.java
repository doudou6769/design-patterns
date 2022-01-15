package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：动物的主人（具体访问者）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Owner implements Person {
    // 具体访问猫的方法
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }

    // 具体访问狗的方法
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }

}

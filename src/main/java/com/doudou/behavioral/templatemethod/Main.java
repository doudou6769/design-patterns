package com.doudou.behavioral.templatemethod;

/**
 * <pre>
 * 说   明：模板方法
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass eat = new EatCake();

        eat.eat();
    }

}

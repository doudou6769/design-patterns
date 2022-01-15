package com.doudou.behavioral.visitor;

/**
 * <pre>
 * 说   明：访问者模式
 *          封装一些作用于某种数据结构中的各元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建家
        Home home = new Home();
        // 添加元素
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());

        // 创建访问者
        Owner owner = new Owner();
        // 访问者访问元素
        home.action(owner);

        // 创建另一个访问者
        Someone someone = new Someone();
        home.action(someone);
    }

}

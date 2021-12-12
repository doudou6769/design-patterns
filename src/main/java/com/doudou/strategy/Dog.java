package com.doudou.strategy;

/**
 * <pre>
 * 说   明：举例：狗
 *         如果新的对象猫也需要进行排序 则同样实现Comparable接口提供compareTo方法即可
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Dog implements Comparable<Dog>{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    // 使用排序功能时 只需要实现compareTo方法 告诉排序工具如何判断2个对象的大小
    @Override
    public int compareTo(Dog o) {
        return this.food - o.food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}

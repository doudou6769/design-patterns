package com.doudou.strategy;

/**
 * <pre>
 * 说   明：举例：狗
 *         缺点：该方式写死了1个对象的比较方式
 *         实际应用过程中可能存在同一个对象在不同的场景下使用的比较方式不同 此时就需要使用Comparator
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

package com.doudou.behavioral.strategy;

import java.util.Arrays;

/**
 * <pre>
 * 说   明：测试
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // Dog的比较方式限制为只能通过food进行比较
        Dog[] dogs = {new Dog(5), new Dog(1), new Dog(3)};
        // 调用排序方法 使用者无需实现排序算法 只需给出比较2个对象的方式（实现Comparable接口）即可
        Sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));

        // Cat的比较方式更灵活，可通过比较器控制
        Cat[] cats = {new Cat(3,5),new Cat(7,2),new Cat(1,3)};
        // 第一种方式 通过height进行比较
        Sorter.sort(cats,(c1,c2) -> c1.height - c2.height);
        System.out.println(Arrays.toString(cats));

        // 第二种方式 通过width进行比较
        Sorter.sort(cats,(c1,c2) -> c1.width - c2.width);
        System.out.println(Arrays.toString(cats));
    }

}

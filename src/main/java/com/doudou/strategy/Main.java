package com.doudou.strategy;

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
        // 创建对象
        Dog[] dogs = {new Dog(5), new Dog(1), new Dog(3)};
        // 调用排序方法 使用者无需实现排序算法 只需给出比较2个对象的方式（实现Comparable接口）即可
        Sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));
    }

}

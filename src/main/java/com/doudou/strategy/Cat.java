package com.doudou.strategy;

/**
 * <pre>
 * 说   明：举例：猫
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Cat {

    int width;
    int height;

    public Cat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}

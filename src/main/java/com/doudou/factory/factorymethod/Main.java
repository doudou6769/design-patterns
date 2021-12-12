package com.doudou.factory.factorymethod;

/**
 * <pre>
 * 说   明：工厂方法示例
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 此时工厂生产的食物是面包  如果需要替换的话 只需改变工厂类型

//        Food food2 = MushroomFactory.create();
        Food food1 = BreadFactory.create();
        food1.printName();

        // 现代世界吃的食物是面包
        // 魔法世界吃的食物是蘑菇
        // （现代世界）和（魔法世界）可以理解为2个不同的产品族
        // 食物就是产品 同样可以作为产品的还有交通工具、衣服等等 2个不同产品族中的同类的产品一定是不同的
        // 工厂方法的缺点在于 如果应用中存在多种产品 除了食物这类产品外 还有其他产品 如交通工具、衣服等
        // 当需要改变一个产品族时，代码多处都需要进行工厂替换 而抽象工厂可以解决这个问题

    }

}

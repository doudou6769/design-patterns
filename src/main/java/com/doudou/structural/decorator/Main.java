package com.doudou.structural.decorator;

/**
 * <pre>
 * 说   明：装饰者模式
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 点一份炒饭 初始类
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDesc() + " " + fastFood.cost());

        // 加一个鸡蛋 装饰后增强
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + " " + fastFood.cost());

        // 再加一个培根 再次装饰增强且不改变源对象
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + " " + fastFood.cost());

    }

}

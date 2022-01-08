package com.doudou.structural.decorator;

/**
 * <pre>
 * 说   明：配料类（抽象装饰者 - 核心）
 *          继承FastFood 增强后的类依然是FastFood的子类 可再次增强
 *          同时聚合FastFood实现类 对原FastFood进行增强（装饰）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}

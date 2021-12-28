package com.doudou.decorator;

/**
 * <pre>
 * 说   明：鸡蛋（具体装饰者）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋",fastFood);
    }

    @Override
    public float cost() {
        return getFastFood().cost() + getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

}

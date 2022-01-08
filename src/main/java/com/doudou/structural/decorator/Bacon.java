package com.doudou.structural.decorator;

/**
 * <pre>
 * 说   明：培根（具体装饰者）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2,"培根", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

}

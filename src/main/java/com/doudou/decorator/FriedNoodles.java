package com.doudou.decorator;

/**
 * <pre>
 * 说   明：炒面（具体构件）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

}

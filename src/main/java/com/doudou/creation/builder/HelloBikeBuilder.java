package com.doudou.creation.builder;

/**
 * <pre>
 * 说   明：产品具体的构建者 哈啰单车构建者
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class HelloBikeBuilder extends BikeBuilder{
    @Override
    public void buildFrame() {
        bike.setFrame("哈啰单车车架 - 蓝色车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("哈啰单车车座 - 黑色车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

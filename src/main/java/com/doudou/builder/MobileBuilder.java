package com.doudou.builder;

/**
 * <pre>
 * 说   明：产品具体的构建者 摩拜单车构建者
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class MobileBuilder extends BikeBuilder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜单车的车架 - 黄色车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜单车的车座 - 黑色车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}

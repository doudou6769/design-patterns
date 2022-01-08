package com.doudou.creation.factory.abstractfactory;

/**
 * <pre>
 * 说   明：现代世界工厂（某一个产品族的工厂）
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class ModernWorldFactory extends WorldFactory{

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

}

package com.doudou.factory.abstractfactory;

/**
 * <pre>
 * 说   明：抽象的世界工厂 可创造不同的世界（产品族）出来
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public abstract class WorldFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();

}

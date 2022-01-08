package com.doudou.creation.factory.abstractfactory;

/**
 * <pre>
 * 说   明：抽象工厂示例
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 应用中如果需要使用其他产品族的话  替换为其他产品族的工厂即可
//        MagicWorldFactory factory = new MagicWorldFactory();
        WorldFactory factory = new ModernWorldFactory();
        Food food = factory.createFood();
        food.printName();
        Vehicle vehicle = factory.createVehicle();
        vehicle.go();

        // 抽象工厂的缺点在于扩展产品族中的产品非常麻烦  需要对每一个已经实现的产品族添加新产品的实现
        // 所以工厂方法的缺点在于无法横向扩展产品族  而抽象工厂的缺点在于无法纵向扩展产品

    }

}

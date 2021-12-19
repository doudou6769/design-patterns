package com.doudou.builder;

/**
 * <pre>
 * 说   明：建造者模式：将复杂对象的内部对象（零件）创建过程和装配过程解耦
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建装配器 传入构造器以控制产品零件如果产生
        BikeDirector bikeDirector = new BikeDirector(new MobileBuilder());
        // 构建自行车
        Bike bike = bikeDirector.constructBike();
        // 查看构建结果
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

}

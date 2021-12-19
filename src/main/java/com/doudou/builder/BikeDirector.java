package com.doudou.builder;

/**
 * <pre>
 * 说   明：装配器 控制自行车的装配流程
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public class BikeDirector {

    // 装配器中需要有构建者提供构建好的部件
    private BikeBuilder builder;

    // 提供有参构造方法
    public BikeDirector(BikeBuilder builder){
        this.builder = builder;
    }

    // 具体控制如何进行装配的方法
    public Bike constructBike(){
        // 注：这里的流程可任意定义 例如先装车座 再装车架
        // 先装车架
        builder.buildFrame();
        // 再装车座
        builder.buildSeat();
        // 最后生成自行车
        return builder.createBike();
    }

}

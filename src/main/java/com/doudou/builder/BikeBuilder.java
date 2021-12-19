package com.doudou.builder;

/**
 * <pre>
 * 说   明：抽象构建者 控制构建产品所需的内容
 * 创   建：窦慧文
 * 日   期：2021/12/19
 * Q    Q：1443502059
 * </pre>
 */
public abstract class BikeBuilder {

    // 说明构建自行车需要自行车对象
    protected Bike bike = new Bike();

    // 说明构建自行车需要车架
    public abstract void buildFrame();

    // 说明构建自行车需要车座
    public abstract void buildSeat();

    // 返回最终构建好的自行车
    public abstract Bike createBike();

    // 如果构建过程比较简单且确定不会变动 可将BikeDirector中的constructBike()方法整合到此类中
    // 但这样不符合对象单一职责的原则 当构建过程需要动态控制的时候 还是要将Director单独提取出来
    // 装配流程固定的情况下可以这么写 不固定的话就需要引入Director
    //    public Bike constructBike(){
    //        // 注：这里的流程可任意定义 例如先装车座 再装车架
    //        // 先装车架
    //        this.buildFrame();
    //        // 再装车座
    //        this.buildSeat();
    //        // 最后生成自行车
    //        return this.createBike();
    //    }

}

package com.doudou.behavioral.mediator;

/**
 * <pre>
 * 说   明：中介者模式
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建中介机构
        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner p1 = new HouseOwner("张三", mediatorStructure);
        Tenant p2 = new Tenant("李四", mediatorStructure);

        mediatorStructure.setTenant(p2);
        mediatorStructure.setHouseOwner(p1);

        p1.contact("有房出租！");
        p2.contact("我要租房！");

    }

}

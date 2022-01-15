package com.doudou.behavioral.mediator;

/**
 * <pre>
 * 说   明：中介机构（具体中介者）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class MediatorStructure extends Mediator{

    // 中介必须知道2类同事（租房者和房东）的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String msg, Person person) {
        if(person == houseOwner){
            // 如果发消息的是房东 则租客接受消息
            tenant.getMsg(msg);
        }else{
            // 如果发消息的是租客 则房东接受消息
            houseOwner.getMsg(msg);
        }
    }

}

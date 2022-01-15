package com.doudou.behavioral.mediator;

/**
 * <pre>
 * 说   明：房东（具体同事类）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 与中介联系
    public void contact(String msg){
        mediator.contact(msg,this);
    }

    // 从中介获得消息
    public void getMsg(String msg){
        System.out.println("房东" + name + "收到消息：" + msg);
    }

}

package com.doudou.behavioral.boserver;

/**
 * <pre>
 * 说   明：具体观察者
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class WxUser implements Observer{

    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "接收到消息：" + msg);
    }

}

package com.doudou.behavioral.boserver;

/**
 * <pre>
 * 说   明：观察者模式
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建公众号
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        // 订阅公众号
        subscriptionSubject.attach(new WxUser("张三"));
        subscriptionSubject.attach(new WxUser("李四"));
        subscriptionSubject.attach(new WxUser("王五"));

        // 更新
        subscriptionSubject.notify("你好");

    }

}

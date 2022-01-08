package com.doudou.behavioral.boserver;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 说   明：具体主题角色
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class SubscriptionSubject implements Subject{

    // 定义集合 存储该主题的观察者
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String msg) {
        // 通知下发
        userList.forEach(obs -> obs.update(msg));
    }
}

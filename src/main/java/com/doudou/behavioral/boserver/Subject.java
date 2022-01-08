package com.doudou.behavioral.boserver;

/**
 * <pre>
 * 说   明：抽象主题
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public interface Subject {

    // 添加订阅者
    void attach(Observer observer);

    // 删除订阅者
    void detach(Observer observer);

    // 通知订阅者更新消息
    void notify(String msg);

}

package com.doudou.behavioral.state;

/**
 * <pre>
 * 说   明：抽象状态
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public abstract class LiftState {

    // 声明环境角色变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}

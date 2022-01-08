package com.doudou.behavioral.state;

/**
 * <pre>
 * 说   明：开启状态
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSE_STATE);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}

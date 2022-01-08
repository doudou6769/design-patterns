package com.doudou.behavioral.state;

/**
 * <pre>
 * 说   明：关闭状态
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class ClosingState extends LiftState{
    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.open();
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.run();
    }
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }
}

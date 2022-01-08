package com.doudou.behavioral.state;

/**
 * <pre>
 * 说   明：状态模式
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.RUN_STATE);

        context.open();
        context.close();
        context.run();
        context.stop();

    }

}

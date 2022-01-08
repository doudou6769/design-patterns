package com.doudou.behavioral.state;

/**
 * <pre>
 * 说   明：环境
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Context {

    public static final LiftState OPEN_STATE = new OpeningState();
    public static final LiftState CLOSE_STATE = new ClosingState();
    public static final LiftState RUN_STATE = new RunningState();
    public static final LiftState STOP_STATE = new StopState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    // 设置当前状态
    public void setLiftState(LiftState liftState) {
        liftState.setContext(this);
        this.liftState = liftState;
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

}

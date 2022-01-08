package com.doudou.behavioral.chain;

/**
 * <pre>
 * 说   明：抽象处理者
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    // 声明后续处理者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置后续处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各级领导处理请假条
    protected  abstract void handlerLeave(LeaveRequest leave);

    // 处理
    public final void submit(LeaveRequest leave){
        // 该领导进行审批
        this.handlerLeave(leave);
        if(this.nextHandler != null && leave.getNum() > this.numEnd){
            // 提交给后续处理者
            this.nextHandler.submit(leave);
        }else{
            System.out.println("处理结束");
        }
    }

}

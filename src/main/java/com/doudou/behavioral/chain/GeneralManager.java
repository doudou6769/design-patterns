package com.doudou.behavioral.chain;

/**
 * <pre>
 * 说   明：小组长
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class GeneralManager extends Handler{

    public GeneralManager(){
        // 定义可审批的假期天数
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("总经理审批同意");
    }

}

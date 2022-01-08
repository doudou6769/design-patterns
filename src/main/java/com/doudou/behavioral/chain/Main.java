package com.doudou.behavioral.chain;

/**
 * <pre>
 * 说   明：责任链模式
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建请假单
        LeaveRequest leaveRequest = new LeaveRequest("小明", 2, "身体不适");
        // 设置责任链
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        // 提交请假申请
        groupLeader.submit(leaveRequest);
    }

}

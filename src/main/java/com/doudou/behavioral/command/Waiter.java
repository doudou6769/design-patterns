package com.doudou.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 说   明：服务员（命令调用者）
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Waiter {

    // 持有待处理的订单（命令）
    private List<Command> commandList;

    public Waiter() {
        this.commandList = new ArrayList<>();
    }

    public void setCommand(Command command){
        this.commandList.add(command);
    }

    // 执行命令
    public void orderUp(){
        System.out.println("服务员：订单来了");
        this.commandList.forEach(Command::execute);
    }

}

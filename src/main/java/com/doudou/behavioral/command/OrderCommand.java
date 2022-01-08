package com.doudou.behavioral.command;

/**
 * <pre>
 * 说   明：订单命令
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class OrderCommand implements Command{

    // 执行者（厨师）
    private SeniorChef seniorChef;
    // 被执行对象（订单）
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    // 厨师处理订单
    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        // 处理订单
        order.getFoodDic().forEach(seniorChef::makeFood);

        try {
            Thread.sleep(100);//停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}

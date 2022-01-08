package com.doudou.behavioral.templatemethod;

/**
 * <pre>
 * 说   明：抽象类（定义模板方法）
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public abstract class AbstractClass {

    // 模板方法 定义完整的吃饭流程 final保证吃饭的流程不变
    public final void eat(){
        // 先洗手
        washHand();
        // 然后吃东西
        eatFood();
        // 然后洗碗
        washBowl();
    }

    // 洗手
    public void washHand(){
        System.out.println("洗手");
    }

    // 抽象方法 吃东西
    public abstract void eatFood();

    // 洗碗
    public void washBowl(){
        System.out.println("洗碗");
    }

}

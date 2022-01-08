package com.doudou.structural.flyweight;

/**
 * <pre>
 * 说   明：抽象享元角色
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public abstract class AbstractBox {

    // 获取图形
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color){
        // 形状为内部状态  颜色为外部状态
        System.out.println("方块形状：" + getShape() + ", 颜色：" + color);
    }

}

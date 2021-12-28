package com.doudou.flyweight;

/**
 * <pre>
 * 说   明：享元模式
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();

        // 使用时外部状态可变  内部状态不可变
        // 省去重复创建对象的过程

        AbstractBox iBox = boxFactory.getShape("I");
        iBox.display("灰");

        AbstractBox lBox = boxFactory.getShape("L");
        lBox.display("黑");

        AbstractBox oBox1 = boxFactory.getShape("O");
        oBox1.display("红");

        AbstractBox oBox2 = boxFactory.getShape("O");
        oBox2.display("蓝");

        System.out.println(oBox1 == oBox2);

    }

}

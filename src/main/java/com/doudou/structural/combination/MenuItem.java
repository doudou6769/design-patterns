package com.doudou.structural.combination;

/**
 * <pre>
 * 说   明：菜单项（叶子节点）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }

}

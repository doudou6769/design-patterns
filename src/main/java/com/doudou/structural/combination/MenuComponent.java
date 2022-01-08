package com.doudou.structural.combination;

/**
 * <pre>
 * 说   明：菜单组件（抽象根节点）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public abstract class MenuComponent {

    protected String name;  // 菜单名称
    protected int level;    // 菜单层级

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();

}

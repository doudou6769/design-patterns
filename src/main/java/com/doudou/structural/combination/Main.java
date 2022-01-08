package com.doudou.structural.combination;

/**
 * <pre>
 * 说   明：组合模式 将有相似特性的类抽象出 抽象根节点 出来
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main{

    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问",3));
        menu1.add(new MenuItem("展开菜单",3));

        MenuComponent menu2 = new Menu("权限配置", 2);
        menu2.add(new MenuItem("页面访问",3));
        menu2.add(new MenuItem("提交保存",3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问",3));
        menu3.add(new MenuItem("新增角色",3));

        MenuComponent menu = new Menu("系统管理", 1);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        // print方法任何形式的组件均可使用
        menu.print();
    }

}

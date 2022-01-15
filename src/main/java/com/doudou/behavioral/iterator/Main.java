package com.doudou.behavioral.iterator;

/**
 * <pre>
 * 说   明：迭代器模式
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建迭代对象容器
        PersonContainerImpl personContainer = new PersonContainerImpl();
        personContainer.addPerson(new Person("张三","1"));
        personContainer.addPerson(new Person("李四","2"));
        personContainer.addPerson(new Person("王五","3"));
        personContainer.addPerson(new Person("赵六","4"));

        // 获取迭代器
        // 这里可以通过获取不同迭代器以指定遍历方式 具体遍历方式在迭代器中实现
        PersonIterator iterator = personContainer.getIterator();

        // 迭代对象
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

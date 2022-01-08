package com.doudou.creation.prototype;

/**
 * <pre>
 * 说   明：测试
 * 创   建：窦慧文
 * 日   期：2021/12/14
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName("张三");
        concretePrototype.setAge(2);

        System.out.println(concretePrototype.getName());
        System.out.println(concretePrototype.getAge());

        ConcretePrototype clone = (ConcretePrototype) concretePrototype.clone();

        System.out.println(clone.getName());
        System.out.println(clone.getAge());


        System.out.println(concretePrototype == clone);


    }

}

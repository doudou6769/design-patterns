package com.doudou.prototype;

/**
 * <pre>
 * 说   明：原型类 实现Cloneable接口的clone方法 提供具体克隆行为的定义
 *         优点：JDK的克隆相比new对象有这更高的性能 它直接操作内存中的二进制流 特别是复制大对象时 性能的差别非常明显
 *         并且使得复制2个相同的对象变得特别简单 只需要调用 clone 方法即可
 *         缺点：克隆不会调用构造方法 并且 可能会破坏单例
 * 创   建：窦慧文
 * 日   期：2021/12/14
 * Q    Q：1443502059
 * </pre>
 */
public class Prototype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}

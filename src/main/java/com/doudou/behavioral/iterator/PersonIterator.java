package com.doudou.behavioral.iterator;

/**
 * <pre>
 * 说   明：迭代器接口
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public interface PersonIterator {

    boolean hasNext();  // 是否包含下一个
    Person next();      // 下一个元素

}

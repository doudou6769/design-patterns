package com.doudou.behavioral.strategy;

/**
 * <pre>
 * 说   明：比较器
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1,T o2);

}

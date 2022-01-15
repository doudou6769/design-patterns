package com.doudou.behavioral.iterator;

/**
 * <pre>
 * 说   明：抽象迭代对象容器
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public interface PersonContainer {

    void addPerson(Person person);

    void removePerson(Person person);

    PersonIterator getIterator();

}

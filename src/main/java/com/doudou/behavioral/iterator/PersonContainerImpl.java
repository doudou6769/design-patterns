package com.doudou.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 说   明：具体迭代对象容器
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class PersonContainerImpl implements PersonContainer{

    private List<Person> list = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        list.add(person);
    }

    @Override
    public void removePerson(Person person) {
        list.remove(person);
    }

    @Override
    public PersonIterator getIterator() {
        return new PersonIteratorImpl(list);
    }

}

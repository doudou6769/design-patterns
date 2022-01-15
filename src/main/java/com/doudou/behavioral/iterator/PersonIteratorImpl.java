package com.doudou.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 说   明：具体迭代器
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class PersonIteratorImpl implements PersonIterator{

    private List<Person> list;
    private int position = 0;


    public PersonIteratorImpl(List<Person> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Person next() {
        return list.get(position++);
    }

}

package com.diguage.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-2
 * Time: 下午4:11
 */
public class ConcreteAggregate<T> extends Aggregate<T> {
    private List<T> items = new ArrayList<T>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void add(T item) {
        items.add(item);
    }

    public int size() {
        return items.size();
    }
}

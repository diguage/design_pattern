package com.diguage.designpattern.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-2
 * Time: 下午4:09
 */
public class ConcreteIterator<T> extends Iterator<T> {
    private ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.get(0);
    }

    @Override
    public T next() {
        T obj = null;
        current++;
        if (current < aggregate.size()) {
            obj = aggregate.get(current);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.size();
    }

    @Override
    public T currentItem() {
        return aggregate.get(current);
    }
}

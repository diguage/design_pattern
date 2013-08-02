package com.diguage.designpattern.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-2
 * Time: 下午4:04
 */
public abstract class Iterator<T> {
    public abstract T first();

    public abstract T next();

    public abstract boolean hasNext();

    public abstract T currentItem();
}

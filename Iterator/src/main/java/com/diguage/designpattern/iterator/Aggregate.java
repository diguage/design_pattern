package com.diguage.designpattern.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-2
 * Time: 下午4:07
 */
public abstract class Aggregate<T> {
    public abstract Iterator<T> createIterator();
}

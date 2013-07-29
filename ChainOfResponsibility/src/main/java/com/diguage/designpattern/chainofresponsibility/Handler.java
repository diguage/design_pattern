package com.diguage.designpattern.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-7-29
 * Time: 下午4:57
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

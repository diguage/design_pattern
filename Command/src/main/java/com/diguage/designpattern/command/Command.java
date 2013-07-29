package com.diguage.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-7-29
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

}

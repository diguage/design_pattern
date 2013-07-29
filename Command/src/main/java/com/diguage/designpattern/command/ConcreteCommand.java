package com.diguage.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-7-29
 * Time: 下午3:41
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

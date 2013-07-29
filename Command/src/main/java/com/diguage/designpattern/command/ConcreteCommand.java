package com.diguage.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-7-29
 * Time: 下午3:41
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

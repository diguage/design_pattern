package com.diguage.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-7-29
 * Time: 下午3:43
 * To change this template use File | Settings | File Templates.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}

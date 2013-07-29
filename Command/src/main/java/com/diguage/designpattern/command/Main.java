package com.diguage.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-7-29
 * Time: 下午3:49
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();

        i.setCommand(c);
        i.executeCommand();
    }
}

package com.diguage.designpattern.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-7-29
 * Time: 下午5:08
 */
public class Main {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[]  requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}

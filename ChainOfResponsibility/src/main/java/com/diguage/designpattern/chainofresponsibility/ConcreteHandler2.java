package com.diguage.designpattern.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-7-29
 * Time: 下午5:05
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println(this.getClass().getName()+ " 处理请求 "+ request);
        } else if (null != successor) {
            successor.handleRequest(request);
        }
    }
}

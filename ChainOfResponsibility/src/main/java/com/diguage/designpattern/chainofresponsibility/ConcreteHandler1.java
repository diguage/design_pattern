package com.diguage.designpattern.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-7-29
 * Time: 下午5:01
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println(this.getClass().getName()+ " 处理请求 "+ request);
        } else if (null != successor) {
            successor.handleRequest(request);
        }
    }
}

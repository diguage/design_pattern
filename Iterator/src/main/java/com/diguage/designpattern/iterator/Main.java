package com.diguage.designpattern.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: D瓜哥，http://www.diguage.com/
 * Date: 13-8-2
 * Time: 下午4:22
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<String> a = new ConcreteAggregate<String>();

        a.add("大鸟");
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        System.out.println("Start…");
        Iterator<String> i = new ConcreteIterator<String>(a);
        String item = i.first();
        while (i.hasNext()) {
            System.out.println(i.currentItem() + " 请买票！");
            i.next();
        }
        System.out.println("End");

    }
}

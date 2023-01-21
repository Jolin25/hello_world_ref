package com.geekbang.jolyne;

/**
 * @author jrl
 * @date Create in 13:20 2023/1/10
 */
public class Base {
    public static void main(String[] args) {
        String veggie = FatherFactory.createPizza("veggie");
        System.out.println(veggie);


        //子类不能覆盖父类的静态方法，理论上来讲，尽管方法完全一样，但是
        //是一个新的方法
        FatherFactory factory = new SonFactory();
        String veggie1 = factory.createPizza("veggie");
        System.out.println(veggie1);

        SonFactory factory1 = new SonFactory();
        String veggie11 = factory1.createPizza("veggie");
        System.out.println(veggie11);
    }
}

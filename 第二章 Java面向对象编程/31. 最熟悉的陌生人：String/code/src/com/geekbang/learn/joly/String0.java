package com.geekbang.learn.joly;

/**
 * @author jrl
 * @date Create in 21:22 2022/12/1
 */
public class String0 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.hashCode());
        str = str + "d";
        System.out.println(str.hashCode());
        Object o = new Object();
        System.out.println(o);


    }
}

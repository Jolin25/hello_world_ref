package com.geekbang.learn.joly;

/**
 * @author jrl
 * @date Create in 13:31 2022/12/15
 */
public class String01 {
    public static void main(String[] args) {
        String a = "Joly";
        String a0 = String0.productString("a");
        System.out.println(a == a0);//true
        StringBuilder sb = new StringBuilder("aaa");
        sb.toString();

        String aa = "abc";
        String bb = new String("abc");
        System.out.println(aa==bb);//false

        String cc = "a"+"b"+"c";
        System.out.println(aa==cc);//true,应该是编译器优化了

        String dd = new StringBuilder().append("a").append("b").append("c").toString();
        System.out.println(aa==dd);//false

        String e = "b";
        String ee = "a"+e+"c";
        System.out.println(aa==ee);//false
    }
}

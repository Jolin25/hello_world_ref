package com.geekbang.learngenerics.onjava8;// generics/LostInformation.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.*;

class Frob {
}

class Fnorkle {
}

class Quark<Q extends Fnorkle> {
}

class Particle<POSITION, MOMENTUM> {
}


public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long, Double> p = new Particle<>();
        System.out.println(Arrays.toString(
                list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
                map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
                quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(
                p.getClass().getTypeParameters()));

        // 没有指定 类型参数 的时候，默认是 Object 作为类型参数
        List list1 = new ArrayList();
        list1.add(1);
        Object o = list1.get(0);
        list1.add(2);
        int a = (Integer) list1.get(0);
    }
}
/* Output:
[E]
[K, V]
[Q]
[POSITION, MOMENTUM]
*/

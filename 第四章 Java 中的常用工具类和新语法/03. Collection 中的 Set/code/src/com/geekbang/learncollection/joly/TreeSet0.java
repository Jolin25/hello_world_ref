package com.geekbang.learncollection.joly;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author jrl
 * @date Create in 23:16 2022/11/1
 */
public class TreeSet0 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("2");
        System.out.println(set1.size());
        String next = set1.iterator().next();
        System.out.println(set1.getClass());
    }
}

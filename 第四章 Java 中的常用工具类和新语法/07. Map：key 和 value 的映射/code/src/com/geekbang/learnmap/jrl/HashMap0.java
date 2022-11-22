package com.geekbang.learnmap.jrl;

import java.util.HashMap;

/**
 * @author jrl
 * @date Create in 22:24 2022/11/8
 */
public class HashMap0 {
    public static void main(String[] args) {
        tableSizeFor();
        nullTest();
    }

    private static void nullTest() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(null,null);
    }
    /**
     * TODO_Joly: 客观的说，这个数学我没看懂，为什么就成了，建议手算一下
     * 将 cap 扩充为 2 的幂次方大小
     * @date 2022/11/9
     * @param
     * @return
     */
    static void tableSizeFor() {
        // TODO_Joly:带符号和不带符号右移到底有啥区别
        int cap = 133;
        int n = cap - 1;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n + 1);


        // System.out.println(15 | 15 >>> 1);
    }
}

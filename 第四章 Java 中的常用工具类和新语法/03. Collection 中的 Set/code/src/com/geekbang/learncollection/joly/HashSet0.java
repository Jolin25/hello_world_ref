package com.geekbang.learncollection.joly;

import java.util.HashSet;

/**
 * @author jrl
 * @date Create in 11:37 2022/11/9
 */
public class HashSet0 implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.clone();
        new HashSet0().super0();
    }

    private void super0() throws CloneNotSupportedException {
        HashSet0 a = (HashSet0) super.clone();
    }
}

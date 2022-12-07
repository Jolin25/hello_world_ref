package com.geekbang.learncollection.joly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author jrl
 * @date Create in 11:37 2022/11/9
 */
public class HashSet0 implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.clone();
        new HashSet0().super0();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        // 利用 set 来对 集合去重
        HashSet<String> hashSet1 = new HashSet<>(list);
        System.out.println(hashSet1);
        list = new ArrayList<>(hashSet1);
        System.out.println(list);
        String[] strings = list.toArray(new String[0]);
        System.out.println(strings);
        // 这里获得的 List 是 Arrays 自己悄悄咪咪搞的一个新的类
        List<String> asList = Arrays.asList(strings);
        // 这个新的类并不支持 remove（）
        // 啊啊啊啊，可怕啊
        asList.remove(0);
        System.out.println(asList);
    }

    private void super0() throws CloneNotSupportedException {
        HashSet0 a = (HashSet0) super.clone();
    }
}

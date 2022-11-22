package com.geekbang.learncollection.joly;

import java.util.ArrayList;

/**
 * @author jrl
 * @date Create in 23:48 2022/10/25
 */
public class List0 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("3");
        arrayList.add("2");


        /** knowledge point:  Comparator 被用于 sort方法 进行排序*/
        arrayList.sort((a, b) -> {
            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(arrayList);

    }
}

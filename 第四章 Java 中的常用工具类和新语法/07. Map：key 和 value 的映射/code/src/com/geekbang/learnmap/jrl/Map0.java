package com.geekbang.learnmap.jrl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jrl
 * @date Create in 18:22 2022/11/24
 */
public class Map0 {
    public static void main(String[] args) {
        Map<String, Person> map = initMap();

    }

    static Map<String, Person> initMap() {
        Map<String, Person> map = new HashMap<>(16);
        map.put("a", new Person("Nico", 16));
        map.put("b", new Person("Mona", 22));
        map.put("c", new Person("Joly", 25));
        map.put("d", new Person("小猴zei", 26));
        return map;
    }
}

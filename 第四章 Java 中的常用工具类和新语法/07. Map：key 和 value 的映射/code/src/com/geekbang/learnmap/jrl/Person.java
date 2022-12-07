package com.geekbang.learnmap.jrl;

/**
 * @author jrl
 * @date Create in 18:23 2022/11/24
 */
public class Person {
    String name;
    int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

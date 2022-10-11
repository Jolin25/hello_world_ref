package com.geekbang.jrl;

/**
 * @author jrl
 * @date Create in 18:25 2022/10/11
 */
public class Base {
    int age;
    // 只含有 private 构造器 的类是不可以被继承的
    private Base(){
        this.age = 1;
    }
}

package com.geekbang.learngenerics.onjava8.onjava;

import java.util.List;

/**
 * @author jrl
 * @date Create in 11:11 2022/10/18
 */
// T 是 泛型
public class GenericOne<T extends Father> { // 但是不可以用通配符？
    // 通配符？，用于限定类型范围
    public void method1(List<? extends Father> hello) {
        System.out.println(hello.getClass().getName());
        // 编译报错
        // hello.add(new Father());
        method2(hello);
        Class<?> a = Father.class;

        method3(new Father());
    }


    // 泛型方法进行进一步的处理
    <T> void method2(T var1) {
        System.out.println(var1);
    }

    private <T extends Father> void method3(T var1) {
        var1.getA();
        var1.setA(1);
    }


    public static void main(String[] args) {

    }
}


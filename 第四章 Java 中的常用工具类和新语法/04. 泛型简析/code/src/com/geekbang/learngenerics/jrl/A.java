package com.geekbang.learngenerics.jrl;

/**
 * @author jrl
 * @date Create in 19:12 2022/10/15
 */
public class A<T> { // 只有实例化Father的时候才需要 确认T这个参数
    public static void a() {
        //  T aa ; // 类.a(); 类加载、初始化，但是没有实例化 ---> 所以编译器就不会通过的

    }

    public static void main(String[] args) {
        new A<Integer>().b("1");
    }

    static <E> void b(E... v1) {
        System.out.println(v1);
        // System.out.println(v1.getClass().getName());
        // System.out.println(getClass().getName());
        // System.out.println(int.class.getName());
        // System.out.println(Integer.class.getName());
        // System.out.println("2".getClass().getName());
        // System.out.println("2");
    }
}

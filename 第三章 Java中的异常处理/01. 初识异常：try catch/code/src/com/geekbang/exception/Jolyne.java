package com.geekbang.exception;

/**
 * @author jrl
 * @date Create in 16:02 2023/1/21
 */
public class Jolyne {
    public static void main(String[] args) {
        try {
            while (true) {
                new Jolyne().recursion();
            }
        } catch (Error error) {
            //TODO Error 是可以被捕获的，但是不建议捕获。
            //TODO Error 发生的时候，JVM一般会选择线程终止。
            System.out.println(error);//java.lang.StackOverflowError
        }
    }

    void recursion() {
        this.recursion();
    }
}

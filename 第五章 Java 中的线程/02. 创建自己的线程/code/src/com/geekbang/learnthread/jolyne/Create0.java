package com.geekbang.learnthread.jolyne;

/**
 * @author jrl
 * @date Create in 17:11 2022/12/19
 */
public class Create0 {
    public static void main(String[] args) {
        create0();
        create1();
        create2();

    }

    private static void create2() {
        // Callable
    }

    private static void create1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new Runnable 的方式。");
            }
        }).start();


    }

    private static void create0() {
        new Thread(() -> {
            System.out.println("new Thread 的方式。");
            int i = 1 / 0;
        }).start();
    }
}

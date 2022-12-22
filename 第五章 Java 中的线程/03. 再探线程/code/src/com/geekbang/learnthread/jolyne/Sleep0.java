package com.geekbang.learnthread.jolyne;

import java.util.concurrent.TimeUnit;

/**
 * 对比两种 sleep方法 的区别。
 * 本质都是 Thread#sleep，只不过看看TimeUnit搞了什么封装。
 * @author jrl
 * @date Create in 13:07 2022/12/20
 */
public class Sleep0 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(0);
        TimeUnit.MILLISECONDS.sleep(0);
    }
}

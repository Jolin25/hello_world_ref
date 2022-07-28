package com.geekbang.exception;

/**
 * knowledge point:
 * Throwable:(都是异常)
 * Error:
 * Exception:
 * 按照处理要求分为：
 * 1.checked exception：
 * 要求必须用try catch或throws处理
 * 2.unchecked exception:
 * 不要求必须处理
 * 2.1 RuntimeException
 * 2.2 Error
 */

public class MustHandel {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class clazz = Class.forName("com.geekbang.exception.MustHandle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

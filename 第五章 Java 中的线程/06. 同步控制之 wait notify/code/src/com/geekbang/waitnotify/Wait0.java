package com.geekbang.waitnotify;

/**
 * @author jrl
 * @date Create in 19:05 2022/11/22
 */
public class Wait0 {
    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        new Thread(() -> {
            synchronized (locker) {
                try {
                    System.out.println("工作线程开始等待");
                    // 等待 timeout 时间后，该线程自动被唤醒
                    locker.wait(5000, 1000);
                    System.out.println("工作线程被唤醒成功！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("主线程开始睡眠");
        Thread.sleep(10000);
        synchronized (locker) {
            System.out.println("主线程开始唤醒工作线程");
            locker.notify();
        }
        System.out.println(new Wait0().toString());
        System.out.println(new Wait0().toString());

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("假装在清理 system resources");
    }
}

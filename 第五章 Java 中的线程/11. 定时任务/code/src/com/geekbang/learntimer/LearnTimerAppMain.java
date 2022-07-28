package com.geekbang.learntimer;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class LearnTimerAppMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // TODO 使用固定的频率schedule任务
        timer.scheduleAtFixedRate(new FindABCTask(), 10, TimeUnit.SECONDS.toMillis(4));
        System.out.println("nowtime:" + new Date().toString());
    }
}

package com.geekbang.learnmap.jrl.oop;

/**
 * @author jrl
 * @date Create in 14:55 2022/12/12
 */
public class Son extends Father {
    @Override
    public void behaviorTwo() {
        System.out.println("Son 对 Father 的 behaviorTwo方法 进行了实现。");
    }

    @Override
    public void behaviorThree() {
        System.out.println("Son 对 Father 实现的 Behavior接口 的 behaviorThree方法 进行了实现。");

    }

    @Override
    public void behaviorOne() {
        System.out.println("Son 对 Father 的 behaviorOne方法 进行了重写。");
    }
}

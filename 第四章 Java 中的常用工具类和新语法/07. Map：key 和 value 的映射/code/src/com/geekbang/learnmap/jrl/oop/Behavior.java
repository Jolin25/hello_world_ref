package com.geekbang.learnmap.jrl.oop;

/**
 * @author jrl
 * @date Create in 14:48 2022/12/12
 */
public interface Behavior {
    void behaviorOne();

    void behaviorTwo();

    void behaviorThree();

    default void behaviorFour() {
        System.out.println("behaviorFour 原生默认实现");
    }
}

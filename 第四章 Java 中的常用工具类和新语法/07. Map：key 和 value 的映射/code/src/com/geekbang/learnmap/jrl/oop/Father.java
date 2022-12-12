package com.geekbang.learnmap.jrl.oop;

/**
 * @author jrl
 * @date Create in 14:47 2022/12/12
 */
public abstract class Father implements Behavior {
    @Override
    public void behaviorOne() {
        System.out.println("Father 实现了 behaviorOne");
    }

    // TODO_Joly:理论上来讲，这个方法我又声明一遍，属于无用功吧，什么都没变。
    @Override
    public abstract void behaviorTwo();

    @Override
    public void behaviorFour() {
        System.out.println("Father 对 behaviorFour 进行了重写。");
    }

    void fatherOne() {
        System.out.println("fatherOne 原生实现");
    }
}

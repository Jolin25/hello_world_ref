package com.geekbang.learngenerics.onjava8.onjava;

/**
 * @author jrl
 * @date Create in 12:15 2022/10/18
 */
public class FatherGeneric<T> {
    int a;
    T t;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

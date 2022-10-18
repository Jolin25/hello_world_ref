package com.geekbang.learngenerics.jrl;

/**
 * @author jrl
 * @date Create in 23:45 2022/10/17
 */
public final class Algorithm {
    public static void main(String[] args) {
        m(1, 2);
    }

    static <T> T m(T a, T b) {
        //Operator '>' cannot be applied to 'T', 'T'
        // 因为 编译的时候会类型擦除为 Object，不可以做 > 运算的
        // System.out.println(a > b);
        return null;
    }
}

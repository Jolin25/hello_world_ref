package com.geekbang.learngenerics.jrl;

/**
 * @author jrl
 * @date Create in 21:47 2022/8/8
 */
public class GeneratorImpl implements Generator<String> {
    // 类上写T
    // @Override
    // public T method() {
    //     return null;
    // }
    // 类上不写T
    // @Override
    // public Object method() {
    //     return null;
    // }


    // 类上指明接口T为String
    @Override
    public String method() {
        return null;
    }


    /**
     * 泛型方法，在返回值前面去标注泛型，真TM地狱语法
     *
     * @param
     * @return
     * @date 2022/8/8
     */
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}

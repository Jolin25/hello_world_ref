package com.geekbang.jolyne;

/**
 * @author jrl
 * @date Create in 13:13 2023/1/10
 */
public class FatherFactory {
    public static String createPizza(String type) {
        if ("veggie".equals(type)) {
            return "veggie";
        }
        return null;
    }
}

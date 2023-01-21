package com.geekbang.jolyne;

/**
 * @author jrl
 * @date Create in 13:18 2023/1/10
 */
public class SonFactory extends FatherFactory {
    public static String createPizza(String type) {
        if ("veggie".equals(type)) {
            return "veggieSon";
        }
        return null;
    }
}

package com.geekbang.waitnotify;

/**
 * @author jrl
 * @date Create in 20:00 2022/11/22
 */
public class Finalize0 {
    public static void main(String[] args) throws Throwable {
        new Finalize0().hello();
        while(true){
            int a = 1;
        }
    }

    private void hello() throws Throwable {
        Wait0 wait0 = new Wait0();
        // wait0.finalize();
        wait0.toString();
    }
}

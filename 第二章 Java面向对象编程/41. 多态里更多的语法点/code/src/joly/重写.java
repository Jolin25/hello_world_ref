package joly;

/**
 * @author jrl
 * @date Create in 18:41 2022/7/28
 */
public class 重写 implements 重载 {


    // 这个行为叫做重写
    @Override
    public void methodA(int a, String b) {

    }

    @Override
    public void methodA(int aaa, int bb) {

    }

    // static void methodStatic(int a, String b) {
    //     System.out.println("hello static");
    // }

    public static void main(String[] args) {
        //Static method may be invoked on containing interface class only
        // methodStatic(1,"1");
        重载.methodStatic(1,"1");
    }

}

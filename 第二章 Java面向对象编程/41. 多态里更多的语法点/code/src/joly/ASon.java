package joly;

/**
 * @author jrl
 * @date Create in 17:12 2022/10/19
 */
public class ASon extends A {
    static void m1() {
        System.out.println("ASon m1");
    }
    public static void main(String[] args) {
        // 接口不可以，但是类可以，直接调用父类的静态方法，而不是 Father.staticMethod()
        m1();
    }
}

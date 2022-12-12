package com.geekbang.joly;

/**
 * 用于学习 JVM 对静态变量 的语法规则
 *
 * @author jrl
 * @date Create in 12:43 2022/12/7
 */
public class clinit0 {

    /*用于理解 JVM 在进行类加载的初始化时，对静态变量的访问和赋值的语法限制。
     * ---> 就是个方便 JVM 去进行实现的破规矩，烦人。（哈哈哈哈，不排除是人家为了咱们用户，等我再体悟体悟咯。）
     * */
    static int s_before_a = 0;
    static int s_before_b;
    int i_before_a;
    static final int SF_A = 1;

    static {
        //可以赋值和访问在当前语句之前的静态变量
        s_before_a = 1;
        //可以对在当前语句之后的静态变量进行赋值
        s_after_c = 1;
        //不可以对在当前语句之后的静态变量进行访问
        // s_before_b = s_after_c;
        //在静态代码块中不可以访问实例变量
        // i_before_a = 0;
        //Error:(29, 9) java: 无法为最终变量SF_A分配值
        // SF_A = 2;
    }

    static int s_after_c;
    int i_after_b;


    public static void main(String[] args) {
        System.out.println(s_after_c);//1
    }
}

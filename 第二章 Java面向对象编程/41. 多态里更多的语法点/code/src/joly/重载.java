package joly;

/**
 * 重载有两种形式：
 * 一种是在同一个类里方法名必须相同，参数类型不同、个数不同、顺序不同，方法返回值和访问修饰符可以不同
 * 另一种是在不同类里，A类实现B类，那么A类需要方法名、参数个数和顺序都一样（也就是说方法签名必需一样）
 * @author jrl
 * @date Create in 18:40 2022/7/28
 */
public interface 重载 {
    void methodA(int a , String b);
    void methodA(int aa,int bb);

}

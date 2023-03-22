package com.geekbang.joly;

/**
 * 测试父类子类的执行顺序：
 * 父类静态代码块-->子类静态代码块
 * -->父类代码块-->父类构造方法
 * -->子类代码块-->子类构造方法
 * @author jrl
 * @date Create in 12:30 2023/3/22
 */
public class Base {
	public static void main(String[] args) {
		new Son("why",29,"male");
	}
}

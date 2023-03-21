package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;
import com.geekbang.supermarket.MerchandiseV2;
import com.geekbang.supermarket.ShellColorChangePhone;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassOfClassAppMain {

	// ...可变长参数，实际上就是一个数组
	public static void main(String... args) throws NoSuchFieldException, NoSuchMethodException {
		LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
				"世纪大道1号", 500, 600, 100);

		MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
		// >> TODO
		// Object类里的getClass方法，可以得到
		Class clazz = ShellColorChangePhone.class;
		// 全 com.geekbang.supermarket.ShellColorChangePhone
		System.out.println(clazz.getName());
		// 简要 ShellColorChangePhone
		System.out.println(clazz.getSimpleName());

		// TODO 通过一个类的 Class 实例，可以获取一个类所有的信息，包括成员变量，方法，等
		Field countField = clazz.getField("count");
		Field nameField = clazz.getField("count");
//        Field countField = clazz.getField("count");
		// 获取 所有可访问的 属性，包含父类
		Field[] fields = clazz.getFields();
		System.out.println("-------------------------");
		Arrays.asList(fields).forEach(System.out::println);

		// 找到 本类 的所有属性，不包含父类
		Field[] declaredFields = clazz.getDeclaredFields();
		System.out.println("------------------");
		Arrays.asList(declaredFields).forEach(System.out::println);

		// >> TODO 变长参数和它的等价形式
//        Method equalsMethod = clazz.getMethod("equals", Object.class);
//         Method buyMethod = clazz.getMethod("buy", int.class, String.class);
//         Method equalsMethod = clazz.getMethod("equals", Object.class);

	}

}

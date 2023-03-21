package com.geekbang.joly;

import java.util.Arrays;

/**
 * @author jrl
 * @date Create in 16:27 2023/3/21
 */
public class Base {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<EnumA> enumAClass = EnumA.class;
		// 对于枚举，直接是可以获取的
		EnumA[] enumConstants = enumAClass.getEnumConstants();
		Arrays.asList(enumConstants).forEach(System.out::println);
	}
}

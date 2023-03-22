package com.geekbang.joly;

/**
 * @author jrl
 * @date Create in 12:30 2023/3/22
 */
public class Son extends Father {
	static private String name;
	private Integer age;
	public String gender;

	static {
		System.out.println("Son static code block");//2
		name = "隔壁小纪";
	}

	{
		System.out.println("Son code block");//5
		name = "隔壁小王";
	}

	public Son(String name, Integer age, String gender) {
		// 子类调用父类的构造器
		super(name, age, gender);
		System.out.println("Son constructor");//6
	}


}

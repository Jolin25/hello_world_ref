package com.geekbang.joly;

/**
 * @author jrl
 * @date Create in 12:29 2023/3/22
 */
public class Father {
	static private String name;
	private Integer age;
	public String gender;

	static {
		System.out.println("Father static code block");//1
		name = "隔壁老纪";
	}

	{
		System.out.println("Father code block");//3
		name = "隔壁老王";
	}

	public Father(String name, Integer age, String gender) {
		System.out.println("Father Constructor");//4
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


}

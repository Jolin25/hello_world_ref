package com.geekbang.learn.joly;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * 1. String 的默认编码格式
 *
 * @author jrl
 * @date Create in 13:44 2023/3/13
 */
public class String00 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "hello 你好";
		byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
		byte[] bytes2 = s.getBytes(StandardCharsets.UTF_16);
		// hello 你好
		System.out.println(new String(bytes));
		// �� h e l l o  O`Y}
		System.out.println(new String(bytes2));

		//  说明 String 是用 UTF_8 来进行编码的，
		// 	当然 UTF_8 只是 idea 默认（editor--->file encodeing 里面进行设置）的而已，idea 对于 JVM 来说相当于 操作系统，

		// 	JVM 会根据 操作系统的编码格式 来进行编解码操作，
		// 	所以，idea 如果设置成 GBK 这种字符集的话，这两个输入就都会是乱码。
		// 	因为,JVM 在运行的时候会按照 GBK 的方式来编码 "hello 你好",
		// 	而采用 UTF_8 来解码这串字节码的话，就会乱码。



		// TODO_Joly:encode 这个方法有个鬼用？
		//  s 是 UTF_8,转不成 UTF_16，那我只能自己转成自己？
		//  ---> 好像转自己也不可以，所以
		//  Translates a string into
		//  application/x-www-form-urlencoded format using a specific encoding scheme.
		//  application/x-www-form-urlencoded 是什么？
		//  ---> <form encType=””>中默认的encType，
		//  form表单数据被编码为key/value格式发送到服务器（表单默认的提交数据的格式）.
		//  也就是说，这是一种内容类型。后端把 数据 转换为 xxx 内容类型，然后告诉前端
		//  是 xxx 内容类型，前端就可以根据 xxx 内容类型 来对 数据 进行解析。
		String utf16 = URLEncoder.encode(s, "UTF-16");
		String utf8 = URLEncoder.encode(s, "UTF-8");
		// hello+%FE%FF%4F%60%59%7D
		System.out.println(utf16);
		// hello+%E4%BD%A0%E5%A5%BD
		System.out.println(utf8);



		// 也就是说 encode 这个方法，不仅把 s 转换成了
		// application/x-www-form-urlencoded 这种内容类型
		// 而且对 s 进行了编码格式的转换。
		String decode = URLDecoder.decode(utf8, "UTF-8");
		String decode2 = URLDecoder.decode(utf8, "UTF-16");
		// hello 你好
		System.out.println(decode);
		// hello ꃥꖽ
		System.out.println(decode2);
	}
}

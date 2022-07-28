package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;

import java.util.Scanner;

public class StringEqualsAppMain {
    public static void main(String[] args) {

        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        String s1 = "aaabbb";

        String s2 = "aaa" + "bbb";

        // >> TODO 说好的每次创建一个新的String对象呢？
        // 理论上比较的是引用指向的地址，不应该相等，但是jdk做了优化，会把相同的string放在同一个地方，这样就相等了
        System.out.println("s1和s2用==判断结果：" + (s1 == s2));
        // Object里的equals比较的是地址，但是String改写了equals方法，比较的就是字符串本身的内容
        System.out.println("s1和s2用 equals 判断结果：" + (s1.equals(s2)));

        // >> TODO 打乱Java对String的的优化，再试试看，如果字符串比较长，就会打乱
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入s1");
        s1 = scanner.nextLine();

        System.out.println("请输入s2");
        s2 = scanner.nextLine();

        System.out.println("s1和s2用==判断结果：" + (s1 == s2));

        System.out.println("s1和s2用 equals 判断结果：" + (s1.equals(s2)));

    }

}

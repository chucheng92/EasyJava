package com.rannn.string;

/**
 * 值传递引用传递测试
 *
 * @author 哓哓
 */
public class StringTest {
    private String test1(String s1) {
        System.out.println(s1);
        s1 = "world";
        return s1;
    }

    public static void main(String[] args) {
        String s1 = "hello1";
        String s2 = new StringTest().test1(s1);
        System.out.println(s1 == s2);
        System.out.println(s1);

//		String s2 = new String("hello2");
//		new StringTest().test1(s2);
//		System.out.println(s2);
    }
}
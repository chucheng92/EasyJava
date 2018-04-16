package com.rannn.comparable;

/**
 * Created by Ryan Tao on 2017/3/9.
 */
public class InfoTest {
    public static void main(String[] args) {
        Info info1 = new Info("c");
        Info info2 = new Info("c");
        Info info3 = new Info("b");
        Info info4 = new Info("d");

        System.out.println(info1.compareTo(info2));
        System.out.println(info1.compareTo(info3));
        System.out.println(info1.compareTo(info4));
    }
}

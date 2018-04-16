package com.rannn.string;

/**
 * String和int的两个基本方法
 *
 * @author 哓哓
 */
public class StringAndInt {
    public static void main(String[] args) {
        // String to int
        String a1 = "10021";
        int res1 = Integer.parseInt(a1);
        System.out.println(res1);

        // int to String
        int a2 = 10;
        String res2 = String.valueOf(a2);
        System.out.println(res2);
    }
}

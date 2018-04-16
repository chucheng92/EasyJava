package com.rannn.regex;

import java.util.Scanner;

//正则表达式判断功能
//RegexDemo
public class RegexDemo1 {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("input your QQ number:");
    // String qq = sc.nextLine();
    // System.out.println(checkQQ(qq));
    // }
    //
    // //方法1
    // public static boolean checkQQ(String qq) {
    // boolean flag = true;
    //
    // if (qq.length() >= 5 && qq.length() <= 15) {
    // if (!qq.startsWith("0")) {
    // char[] chs = qq.toCharArray();
    // for (int i = 0; i < qq.length(); ++i) {
    // char ch = chs[i];
    // if (!Character.isDigit(ch)) {
    // flag = false;
    // break;
    // }
    // }
    // } else {
    // flag = false;
    // }
    // } else {
    // flag = false;
    // }
    // return flag;
    // }

    // 方法2 正则表达式
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your email:");
        String email = sc.nextLine();
        System.out.println(checkEmail(email));
    }

    public static boolean checkEmail(String email) {
        boolean flag = true;

        String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        flag = email.matches(regex);

        return flag;
    }
}
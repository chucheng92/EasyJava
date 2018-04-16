package com.rannn.regex;

//正则表达式替换功能
public class RegexDemo3 {
    public static void main(String[] args) {
        String s = "hello12345aaworld@!";

        String regex = "\\d+";

        String ss = "";

        String res = s.replaceAll(regex, ss);

        System.out.println(res);
    }
}


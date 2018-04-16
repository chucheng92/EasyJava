package com.rannn.string;

//字符串获取功能
public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Helloworld1233";

        System.out.println(s.length()); // 11
        System.out.println(s.charAt(7)); // r
        System.out.println(s.indexOf('l')); // 2
        System.out.println(s.indexOf("l")); // 2
        System.out.println(s.indexOf("ell")); // 1
        System.out.println(s.indexOf('w', 1)); // 5
        System.out.println(s.substring(0, 5)); // hello

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (ch > 'A' && ch < 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else {
                numberCount++;
            }
        }
        System.out.println(bigCount + " " + smallCount + " " + numberCount);
    }
}

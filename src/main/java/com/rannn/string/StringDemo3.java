package com.rannn.string;

public class StringDemo3 {
    public static void main(String[] args) {
        // 数组转换成字符串
        /*
		 * int arr[] = { 1, 2, 3 }; String s = "[";
		 * 
		 * for (int i = 0; i < arr.length; ++i) { if (i == arr.length-1) { s +=
		 * arr[i] + "]"; } else { s += arr[i] + ", "; } } System.out.println(s);
		 */

        // 2.统计大串中小串出现次数
        String s1 = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String s2 = "java";
        int count = 0;

        int index;
        while ((index = s1.indexOf(s2)) != -1) {
            count++;
            s1 = s1.substring(index + s2.length());
            index = s1.indexOf(s2);
        }
        System.out.println(count);
    }
}

package com.rannn.object;

//equals方法
public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student("Ta", 20);
        Student s2 = new Student("Ta", 20);
        Student s3 = new Student("Pa", 20);

        System.out.println(s1 == s2); //false
        System.out.println("----------");
        System.out.println(s1.equals(s2)); //true

        System.out.println(s1.equals(s3)); //false
        System.out.println(s3.equals(s1)); //false

        String s4 = "12" + "32";// 反编译
        String s5 = new String("12");
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }
}

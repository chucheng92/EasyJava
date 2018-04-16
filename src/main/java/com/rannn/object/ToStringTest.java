package com.rannn.object;

//toString方法
//public String toString()方法
//方法的值等价于this.getClass().getName() + '@'+ Integer.toHexString(this.hashCode())
public class ToStringTest {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());

        System.out.println(s.toString());
        System.out.println(s.getClass().getName() + '@' + Integer.toHexString(s.hashCode()));
        //直接输出对象名称的时候是调用了toString方法
        System.out.println(s);
    }
}

package com.rannn.object;

//getClass()方法
//public final Class getClass():返回此 Object 的运行时类
//public string getName():以 String 的形式返回此 Class 对象所表示的实体

public class GetClassTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Class c = s1.getClass();
        String str = c.getName();
        System.out.println(str);

        //链式编程
        String str2 = s1.getClass().getName();
        System.out.println(str2);

    }
}

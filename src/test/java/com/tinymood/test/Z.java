package com.tinymood.test;

/*
 * 单个类中: 静态代码(同级别按次序执行) -> main方法 -> 构造块 -> 构造方法
 * 涉及继承：
    a.初始化父类中的静态成员变量和静态代码块  
	b.初始化子类中的静态成员变量和静态代码块
	c.初始化父类的普通成员变量和构造代码块(按次序)，再执行父类的构造方法
	d.初始化子类的普通成员变量和构造代码块(按次序)，再执行子类的构造方法
 */
class X {
	{System.out.print("1");}
    
	Y y=new Y();
	
    public X(){
        System.out.print("X");
    }
    
    {System.out.print("2");}
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}

public class Z extends X {
	{System.out.print("3");}
    Y y=new Y();
    public Z() {
        System.out.print("Z");
    }
    {System.out.print("4");}
    public static void main(String[] args) {
        new Z();
    }
}


package com.rannn.clone;

// 测试clone方法和cloneable接口
public class CloneTest {
	public static void main(String[] args) {
		try {
			new CloneTest().clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(1);
	}
}

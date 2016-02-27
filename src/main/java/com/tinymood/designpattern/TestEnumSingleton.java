package com.tinymood.designpattern;

import java.lang.reflect.Constructor;

// 测试单例模式反射创建实例
public class TestEnumSingleton {
	public static void main(String[] args) {
		testEnumSingleton();
	}
	
	public static void testEnumSingleton() {
		try {
			Singleton instance = Singleton.getInstance();
			
			Class<?> clazz = Class.forName("com.tinymood.designpattern.Singleton");
			Constructor<?>[] cons = clazz.getDeclaredConstructors();
			Constructor<?> c = cons[0];
			c.setAccessible(true);
			Singleton instance2 = (Singleton)c.newInstance(null);
			
			System.out.println(instance + "/" + instance2);
			System.out.println(instance == instance2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

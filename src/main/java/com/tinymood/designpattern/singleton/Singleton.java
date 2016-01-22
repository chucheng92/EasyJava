package com.tinymood.designpattern.singleton;

public class Singleton {
	private Singleton() {
	}
	
	private volatile static Singleton uniqueInstance;
	
	// 双重检查加锁
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	// 直接做法
	public static synchronized Singleton getInstance2() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	// 急加载
//	private static Singleton uniqueInstance = new Singleton();
}

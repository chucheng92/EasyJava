package com.tinymood.javase.generic;

// 泛型方法
public class GenericMethod {
	public static void main(String[] args) {
		Box<String> box = new Box<String>("box");
		System.out.println("box:" + box.getData());
	}
}


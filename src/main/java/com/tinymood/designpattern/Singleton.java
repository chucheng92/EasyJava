package com.tinymood.designpattern;

public enum Singleton {
	UNIQUE_INSTANCE;
	
	public static Singleton getInstance() {
		return UNIQUE_INSTANCE;
	}
}

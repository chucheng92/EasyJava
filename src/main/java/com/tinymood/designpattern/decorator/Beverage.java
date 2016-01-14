package com.tinymood.designpattern.decorator;

/*
 * 抽象组件Beverage
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

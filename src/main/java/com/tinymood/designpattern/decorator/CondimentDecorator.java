package com.tinymood.designpattern.decorator;

/*
 * 抽象装饰者
 */
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}

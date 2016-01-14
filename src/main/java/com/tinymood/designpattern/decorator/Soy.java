package com.tinymood.designpattern.decorator;

/*
 * 实现具体装饰者 - Soy豆浆配料
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.description+",Soy";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.15;
	}

}

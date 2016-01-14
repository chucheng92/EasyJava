package com.tinymood.designpattern.decorator;

/*
 * 实现具体装饰者 - Whip奶泡配料
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.10;
	}

}

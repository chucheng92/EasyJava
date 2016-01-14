package com.tinymood.designpattern.decorator;

/*
 * 实现具体装饰者 - Mocha摩卡配料
 */
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.20;
	}

}

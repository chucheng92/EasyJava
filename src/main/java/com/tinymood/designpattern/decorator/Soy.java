package com.tinymood.designpattern.decorator;

/*
 * 实现具体装饰者 - Soy豆浆配料
 */
public class Soy extends CondimentDecorator {	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.description+",Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (getSize() == Size.TALL) {
			cost += 0.10;
		} else if (getSize() == Size.GRANDE) {
			cost += 0.15;
		} else if (getSize() == Size.VENTI) {
			cost += 0.20;
		}
		return cost;
	}

}

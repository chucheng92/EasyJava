package com.tinymood.designpattern.decorator;

/*
 * 具体组件
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}

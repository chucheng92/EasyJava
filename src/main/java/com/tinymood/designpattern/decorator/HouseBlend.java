package com.tinymood.designpattern.decorator;

/*
 * 具体组件
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return .89;
	}

}

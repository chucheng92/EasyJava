package com.tinymood.designpattern.decorator;

/*
 * 具体组件
 */
public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}

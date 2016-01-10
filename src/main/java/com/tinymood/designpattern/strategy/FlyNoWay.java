package com.tinymood.designpattern.strategy;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("不会飞～～");
	}
	
}

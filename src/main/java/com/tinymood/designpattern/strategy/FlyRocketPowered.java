package com.tinymood.designpattern.strategy;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我是火箭鸭～～");
	}

}

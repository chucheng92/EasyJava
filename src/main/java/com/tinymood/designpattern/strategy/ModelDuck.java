package com.tinymood.designpattern.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void swim() {
		System.out.println("我会游泳～～");
	}

	@Override
	public void display() {
		System.out.println("我是模型鸭。");
	}

}

package com.tinymood.designpattern.strategy;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("我是绿头鸭。");
	}
	
	@Override
	public void swim() {
		System.out.println("我会游泳。");
	}
}

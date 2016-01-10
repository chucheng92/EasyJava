package com.tinymood.designpattern.strategy;

public class TestDuck {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}

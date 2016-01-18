package com.tinymood.designpattern.factory.pizzafm;

// 比萨店框架
// 抽象创建者类
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}

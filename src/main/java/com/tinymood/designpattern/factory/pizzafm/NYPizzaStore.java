package com.tinymood.designpattern.factory.pizzafm;

// 具体创建者
public class NYPizzaStore extends PizzaStore {

	// 工厂方法
	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
	
}

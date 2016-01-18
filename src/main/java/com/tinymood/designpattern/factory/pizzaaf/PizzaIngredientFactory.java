package com.tinymood.designpattern.factory.pizzaaf;

// 抽象原料工厂
public interface PizzaIngredientFactory {
	public abstract Dough createDough();
	public abstract Sauce createSauce();
	public abstract Cheese createCheese();
	public abstract Veggies[] createVeggies();
	public abstract Pepperoni createPepperoni();
	public abstract Clam createClam();
}

package com.tinymood.designpattern.factory.pizzaaf;

// 芝加哥原料工厂
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	// 纽约近海 有新鲜的蛤蜊
	public Clam createClam() {
		// TODO Auto-generated method stub
		return new FrozenClams();
	}

}

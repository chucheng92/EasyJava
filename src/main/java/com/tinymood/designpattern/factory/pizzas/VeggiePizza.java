package com.tinymood.designpattern.factory.pizzas;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded mozzarellar");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}
}

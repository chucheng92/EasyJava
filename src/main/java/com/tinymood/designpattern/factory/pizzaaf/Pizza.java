package com.tinymood.designpattern.factory.pizzaaf;

/*
 * 工厂产品
 * 抽象产品类
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Pepperoni pepperoni;
	Clam clam;
	Veggies veggies[];
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Baking "+name);
	}
	
	void cut() {
		System.out.println("Cutting "+name);
	}
	
	void box() {
		System.out.println("Boxing "+name);
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---"+name+"---\n");
		
		if (dough != null) {
			display.append(dough);
			display.append("\n");
		}
		if (sauce != null) {
			display.append(sauce);
			display.append("\n");
		}
		if (cheese != null) {
			display.append(cheese);
			display.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				display.append(veggies[i]);
				if (i < veggies.length-1) {
					display.append(", ");
				}
			}
			display.append("\n");
		}
		if (clam != null) {
			display.append(clam);
			display.append("\n");
		}
		if (pepperoni != null) {
			display.append(pepperoni);
			display.append("\n");
		}
		return display.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
 }

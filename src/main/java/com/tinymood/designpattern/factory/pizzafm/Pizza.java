package com.tinymood.designpattern.factory.pizzafm;

import java.util.ArrayList;
import java.util.List;

/*
 * 工厂产品
 * 抽象产品类
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
	
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
		display.append(dough+"\n");
		display.append(sauce+"\n");
		for (String topping : toppings) {
			display.append(topping+"\n");
		}
		return display.toString();
	}
	
	public String getName() {
		return name;
	}
 }

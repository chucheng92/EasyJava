package com.tinymood.designpattern.factory.pizzas;

import java.util.ArrayList;
import java.util.List;

/*
 * 抽象Pizza类
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("Preparing "+name);
	}
	
	public void bake() {
		System.out.println("Baking "+name);
	}
	
	public void cut() {
		System.out.println("Cutting "+name);
	}
	
	public void box() {
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

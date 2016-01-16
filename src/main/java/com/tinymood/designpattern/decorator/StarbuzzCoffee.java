package com.tinymood.designpattern.decorator;

import com.tinymood.designpattern.decorator.Beverage.Size;

/*
 * 测试装饰者模式
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		// 普通Espresso
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		// 双摩卡奶泡深焙
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		// 综合豆浆摩卡奶泡
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
		
		// 加入大中小杯
		Beverage beverage4 = new Espresso();
		beverage4.setSize(Size.GRANDE);
		beverage4 = new Soy(beverage4);
		System.out.println(beverage4.getDescription() 
				+ " $" + String.format("%.2f", beverage4.cost()));
	}
}

package com.tinymood.designpattern.strategy;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("吱吱叫～～");
	}

}

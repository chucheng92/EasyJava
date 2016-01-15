package com.tinymood.designpattern.decorator;

/*
 * 抽象组件Beverage
 */
public abstract class Beverage {
	public enum Size{TALL, GRANDE, VENTI};
	
	Size size = Size.TALL;
	
	String description = "Unknown Beverage";
	
    public Size getSize() {
    	return size;
    };
    
    public void setSize(Size size) {
    	this.size = size;
    };
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

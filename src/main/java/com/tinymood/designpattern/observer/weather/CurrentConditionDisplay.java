package com.tinymood.designpattern.observer.weather;

// 目前状况布告板
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("当前天气状况:\n"+"温度: "+temperature+"°\n"+"湿度： "+humidity+"%\n"+"气压: "+pressure+"百帕");
	}
}

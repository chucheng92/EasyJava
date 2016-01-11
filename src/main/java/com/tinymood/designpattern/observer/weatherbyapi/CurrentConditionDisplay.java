package com.tinymood.designpattern.observer.weatherbyapi;

import java.util.Observable;
import java.util.Observer;

// 目前状况布告板
public class CurrentConditionDisplay implements Observer {
	private Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			this.temperature = ((WeatherData) o).getTemperature();
			this.humidity = ((WeatherData) o).getHumidity();
			this.pressure = ((WeatherData) o).getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("当前天气状况:\n"+"温度: "+temperature+"°\n"+"湿度： "+humidity+"%\n"+"气压: "+pressure+"百帕");
	}
	
}

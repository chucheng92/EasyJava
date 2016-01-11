package com.tinymood.designpattern.observer.weatherbyapi;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
	private float currentPressure = 1013.0f;
	private float lastPressure;
	private Observable observable;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			lastPressure = currentPressure;
			currentPressure = ((WeatherData) o).getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.println("天气预测:");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}

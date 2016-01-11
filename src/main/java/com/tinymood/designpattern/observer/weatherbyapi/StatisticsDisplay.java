package com.tinymood.designpattern.observer.weatherbyapi;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {
	private float sum = 0.0f;
	private float maxTemperature = -200.0f;
	private float minTemperature = 200.0f;
	private int num = 0;
	Observable observable;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			sum += ((WeatherData) o).getTemperature();
			num++;
			if (((WeatherData) o).getTemperature() > maxTemperature) {
				maxTemperature = ((WeatherData) o).getTemperature();
			}
			
			if (((WeatherData) o).getTemperature() < minTemperature) {
				minTemperature = ((WeatherData) o).getTemperature();
			}
			display();
		}
	}

	public void display() {
		System.out.println("平均气温/最低气温/最高气温："+sum/num+"°/"+minTemperature+"°/"+maxTemperature+"°");
	}



	

}

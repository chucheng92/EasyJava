package com.tinymood.designpattern.observer.weather;

public class StatisticsDisplay implements DisplayElement, Observer {
	private float sum = 0.0f;
	private float maxTemperature = -200.0f;
	private float minTemperature = 200.0f;
	private int num = 0;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		sum += temperature;
		num++;
		if (temperature > maxTemperature) {
			maxTemperature = temperature;
		}
		
		if (temperature < minTemperature) {
			minTemperature = temperature;
		}
		display();
	}

	@Override
	public void display() {
		System.out.println("平均气温/最低气温/最高气温："+sum/num+"°/"+minTemperature+"°/"+maxTemperature+"°");
	}

}

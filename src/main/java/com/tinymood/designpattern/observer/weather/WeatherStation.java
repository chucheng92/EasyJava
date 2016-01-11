package com.tinymood.designpattern.observer.weather;

/**
 * 气象站测试；类
 * @author 哓哓
 *
 */
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		// 三个布告板
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(21f, 65f, 1014f);
		weatherData.setMeasurements(22f, 65f, 1014f);
		weatherData.setMeasurements(23f, 65f, 1011f);
	}
}

package com.delta.backend.exam;

public class WeatherStation
{
	public static void main(String [] args)
	{
		WeatherData weatherData = new WeatherData();
		weatherData.addWeatherDisplayObserver(new CurrentConditionDisplay());
		weatherData.addWeatherDisplayObserver(new ForecastDisplay());
		weatherData.addWeatherDisplayObserver(new StatisticsDisplay());
		
		weatherData.setMeasurements(80, 65);
		weatherData.setMeasurements(92, 70);
		weatherData.setMeasurements(68, 90);
	}
}

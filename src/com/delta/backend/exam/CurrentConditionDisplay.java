package com.delta.backend.exam;

public class CurrentConditionDisplay implements WeatherDisplayObserver
{
	public void display(WeatherData weatherData)
	{
		System.out.println("Current conditions: " + weatherData.getTemperature() + "C degrees and " + weatherData.getHumidity() + "% humidity");
	}
}

package com.delta.backend.exam;

public class StatisticsDisplay implements WeatherDisplayObserver
{
	private float maxTemp = 0.0f;
	private float minTemp = Float.MAX_VALUE;

	public void display(WeatherData weatherData)
	{
		if (weatherData.getTemperature() > maxTemp)
		{
			maxTemp = weatherData.getTemperature();
		}
		if (weatherData.getTemperature() < minTemp)
		{
			minTemp = weatherData.getTemperature();
		}
		System.out.println("Max/Min temperature = " + maxTemp + "/" + minTemp);
	}
}

package com.delta.backend.exam;

public class ForecastDisplay implements WeatherDisplayObserver
{
	private float currentTemperature = 30;
	private float lastTemperature;

	public void display(WeatherData weatherData)
	{
		this.lastTemperature = currentTemperature;
		this.currentTemperature = weatherData.getTemperature();
		
		if (currentTemperature > lastTemperature)
		{
			System.out.println("The temperature is getting higher.");
		}
		else if (currentTemperature < lastTemperature)
		{
			System.out.println("The temperature is getting colder.");
		}
		else
		{
			System.out.println("The temperature stays the same.");
		}
	}
}

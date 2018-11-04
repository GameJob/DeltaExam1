package com.delta.backend.exam;

import java.util.ArrayList;

public class WeatherData implements WeatherDisplaySubject
{
	private float temperature;
	private float humidity;
	private ArrayList<WeatherDisplayObserver> observers = new ArrayList<>();
	
	public void setMeasurements(float temperature, float humidity)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		notifyWeatherDisplayObservers();
	}

	public float getTemperature()
	{
		return temperature;
	}

	public float getHumidity()
	{
		return humidity;
	}
	
	public void addWeatherDisplayObserver(WeatherDisplayObserver display)
	{
		observers.add(display);
	}
	
	public void removeWeatherDisplayObserver(WeatherDisplayObserver display)
	{
		observers.remove(display);
	}

	@Override
	public void notifyWeatherDisplayObservers()
	{
		for (WeatherDisplayObserver display: observers)
		{
			display.display(this);
		}
	}
}

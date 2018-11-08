package com.delta.backend.exam;

public interface WeatherDisplaySubject
{
	void addWeatherDisplayObserver(WeatherDisplayObserver display);

	void removeWeatherDisplayObserver(WeatherDisplayObserver display);

	void notifyWeatherDisplayObservers();
}

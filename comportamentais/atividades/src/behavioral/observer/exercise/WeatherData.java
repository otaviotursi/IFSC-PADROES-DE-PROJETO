package behavioral.observer.exercise;

import java.util.LinkedList;
import java.util.List;

public class WeatherData{

	private double temperature, humidity, pressure;
	private List<Observer> _observers;

	
	public WeatherData(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		_observers = new LinkedList<Observer>();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		Notify();
	}

	
	public void Attach(Observer o) {
		_observers.add(o);
	}
	
	public void Detach(Observer o) {
		_observers.remove(o);
	}
	
	public void Notify() {
		for (Observer observer : _observers) {
			observer.Update(this);
		}
	}


}

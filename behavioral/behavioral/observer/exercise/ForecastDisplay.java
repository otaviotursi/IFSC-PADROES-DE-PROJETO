package behavioral.observer.exercise;

public class ForecastDisplay {

	WeatherData data;
	
	public ForecastDisplay(WeatherData data) {
		this.data = data;
	}
	
	public void display() {
		System.out.println(">>> Forecast: ");
		System.out.println("Temperature: " + data.getTemperature());
		System.out.println("Humidity: " + data.getHumidity());
		System.out.println("Pressure: " + data.getPressure());
		
	}

	public WeatherData getData() {
		return data;
	}

	public void setData(WeatherData data) {
		this.data = data;
	}

}

package behavioral.observer.exercise;

public class StatisticsDisplay{

	WeatherData data;
	
	public StatisticsDisplay(WeatherData data) {
		this.data = data;
	}

	public void display() {
		System.out.println(">>> Statistics: ");
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

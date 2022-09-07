package behavioral.observer.sample;

public class ClockTimer extends Subject{

	public int GetHour() {
		return 0;// dummy implementation
	}
	public int GetMinute() {
		return 0;// dummy implementation
	}
	public int GetSecond() {
		return 0;// dummy implementation
	}
	
	public void Tick() {
		// update internal time-keeping state
		// . . .
		Notify();
	}
}

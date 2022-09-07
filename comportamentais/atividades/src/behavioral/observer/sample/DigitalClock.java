package behavioral.observer.sample;

public class DigitalClock implements Observer{
	
	private ClockTimer _subject;

	public DigitalClock(ClockTimer _subject) {
		this._subject = _subject;
		_subject.Attach(this);
	}

	@Override
	public void Update(Subject theChangedSubject) {
		if(theChangedSubject == _subject) {
			// display time info.....
		}	
	}
}

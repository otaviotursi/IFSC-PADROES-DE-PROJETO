package behavioral.chainOfResponsibility.sample;

public class HelperHandler {
	private HelperHandler _successor;
	private Topic _topic;
	
	
	public HelperHandler() {
		this._successor = null;
		this._topic = Topic.NO_HELP_TOPIC;
	}
	
	public HelperHandler(HelperHandler _successor, Topic _topic) {
		this._successor = _successor;
		this._topic = _topic;
	}
	
	public void SetHandler(HelperHandler _successor, Topic _topic) {
		this._successor = _successor;
		this._topic = _topic;
	}
	
	public boolean HasHelp() {
		return _topic != Topic.NO_HELP_TOPIC;
	}
	
	public void HandleHelp() {
		if(_successor != null) {
			_successor.HandleHelp();
		}
	}
}

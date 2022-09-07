package behavioral.chainOfResponsibility.sample;

public class Dialog extends Widget {

	public Dialog(Widget _parent, Topic _topic) {
		super(_parent, _topic);
	}

	@Override
	public void HandleHelp() {
		if (HasHelp()) {
			System.out.println("Help on the Dialog");
		} else {
			super.HandleHelp();
		}
	}
}

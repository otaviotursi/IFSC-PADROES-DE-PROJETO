package behavioral.chainOfResponsibility.sample;

public class Button extends Widget{

	public Button(Widget _parent, Topic _topic) {
		super(_parent, _topic);
	}

	@Override
	public void HandleHelp() {
		if(HasHelp()) {
			System.out.println("Help on the button");
		} else {
			super.HandleHelp();
		}
	}
}

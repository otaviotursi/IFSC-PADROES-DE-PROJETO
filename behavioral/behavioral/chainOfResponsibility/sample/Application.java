package behavioral.chainOfResponsibility.sample;

public class Application extends Widget{

	public Application(Topic _topic) {
		super(null, _topic);
	}

	@Override
	public void HandleHelp() {
		if(HasHelp()) {
			System.out.println("Help on the application");
		} else {
			super.HandleHelp();
		}
	}
}

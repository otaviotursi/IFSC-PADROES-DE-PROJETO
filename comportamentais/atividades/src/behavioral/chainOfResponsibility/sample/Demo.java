package behavioral.chainOfResponsibility.sample;


public class Demo {

	public static void main(String[] args) {
		
		Application application = new Application(Topic.APPLICATION_TOPIC);
		Dialog dialog = new Dialog(application, Topic.PRINT_TOPIC);
		Button button = new Button(dialog, Topic.PAPER_ORIENTATION_TOPIC);
		
		button.HandleHelp();
	}

}

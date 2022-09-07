package behavioral.state.exercise;


public class Robot implements RoboticState{

	private String state;
	
	public Robot() {
		state = "ON";
	}

	@Override
	public void walk() {
		System.out.println("Walking...");
	}

	@Override
	public void cook() {
		if(state.equalsIgnoreCase("OFF")) {
			System.out.println("Cannot cook at Off state.");
		}else {
			state="COOK";
			System.out.println("Cooking...");
		}
		
	}

	@Override
	public void off() {
		if(state.equalsIgnoreCase("COOK")) {			
			System.out.println("Cannot switched off while cooking...");
		}else {
			state = "OFF";
			System.out.println("Robot is switched off");	
		}
		
	}

	
}
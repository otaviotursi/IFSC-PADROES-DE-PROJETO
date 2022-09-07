package behavioral.state.exercise;

public class MainAntes {

	public static void main(String[] args) {
		OldRobot robot = new OldRobot();
		robot.walk();
		robot.walk();
		robot.cook();
		robot.off();
		robot.walk();
		robot.off();
		robot.walk();
		robot.off();
		robot.cook();

	}
}

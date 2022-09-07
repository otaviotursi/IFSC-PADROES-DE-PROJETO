package creationals.prototype.exercise;

public class OrcKing implements King{

	public String getDescription() {

	    return "This is the Orc King!";
	}

	public King Clone() {
		return new OrcKing();
	}

}

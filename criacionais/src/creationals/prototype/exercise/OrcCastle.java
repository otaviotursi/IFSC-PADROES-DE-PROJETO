package creationals.prototype.exercise;

public class OrcCastle implements Castle{
	public String getDescription() {
	    return "This is the Orc Castle!";
		
	}
	public Castle Clone() {
		return new OrcCastle();
	}
}

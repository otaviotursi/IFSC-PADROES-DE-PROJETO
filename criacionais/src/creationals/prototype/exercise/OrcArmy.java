package creationals.prototype.exercise;

public class OrcArmy implements Army{
	
	public String getDescription() {
	    return "This is the Orc Army!";
	}
	
	public Army Clone(){
		return new OrcArmy();
	}
}

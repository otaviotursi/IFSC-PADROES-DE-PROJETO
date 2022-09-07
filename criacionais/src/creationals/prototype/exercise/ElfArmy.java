package creationals.prototype.exercise;

public class ElfArmy implements Army{
	
	public String getDescription() {
	    return "This is the Elf Army!";
	}
	
	public Army Clone(){
		return new ElfArmy();
	}
}

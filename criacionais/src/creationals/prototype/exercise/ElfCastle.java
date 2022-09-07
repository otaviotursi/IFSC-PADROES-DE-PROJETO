package creationals.prototype.exercise;

public class ElfCastle implements Castle{
	public String getDescription() {
	    return "This is the Elf Castle!";
		
	}
	public Castle Clone() {
		return new ElfCastle();
	}
}

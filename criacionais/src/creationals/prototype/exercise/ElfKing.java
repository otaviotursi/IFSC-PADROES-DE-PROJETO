package creationals.prototype.exercise;

public class ElfKing implements King{

	public String getDescription() {

	    return "This is the Elf King!";
	}

	public King Clone() {
		return new ElfKing();
	}

}

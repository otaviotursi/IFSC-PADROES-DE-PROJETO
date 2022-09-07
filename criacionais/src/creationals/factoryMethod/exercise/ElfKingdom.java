package creationals.factoryMethod.exercise;

public class ElfKingdom extends Kingdom{

	public King makeKing() {
		return new ElfKing();
	}

	public Castle makeCastle() {
		return new ElfCastle();
	}

	public Army makeArmy() {
		return new ElfArmy();
	}

}

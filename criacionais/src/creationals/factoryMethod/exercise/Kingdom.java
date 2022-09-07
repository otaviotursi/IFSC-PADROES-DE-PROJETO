package creationals.factoryMethod.exercise;

public abstract class Kingdom{

	private King k;
	private Castle c;
	private Army a;
	
	
	abstract King makeKing();

	abstract Castle makeCastle();

	abstract Army makeArmy();
	
	public Kingdom() {
		k = makeKing();
		c = makeCastle();
		a = makeArmy();
	}
	
	public void printDescription() {
		System.out.println(k.getDescription());
		System.out.println(c.getDescription());
		System.out.println(k.getDescription());
	}
}

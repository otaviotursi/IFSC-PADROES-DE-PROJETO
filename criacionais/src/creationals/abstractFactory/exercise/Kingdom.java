package creationals.abstractFactory.exercise;

public class Kingdom {
	public Army a;
	public King k;
	public Castle c;
	
	public Kingdom(KingdomFactory factory) {
		a = factory.CriarArmy();
		k = factory.CriarKing();
		c = factory.CriarCastle();
	}
	public void getDescription() {
		System.out.println(k.getDescription());
		System.out.println(c.getDescription());
		System.out.println(k.getDescription());
	}
}

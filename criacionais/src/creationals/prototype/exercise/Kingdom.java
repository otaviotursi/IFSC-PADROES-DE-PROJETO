package creationals.prototype.exercise;

public class Kingdom {

	private King k;
	private Castle c;
	private Army a;
	
	public Kingdom(KingdomFactory kingdomFactory) {
		c = kingdomFactory.MakeCastle();
		k = kingdomFactory.MakeKing();
		a = kingdomFactory.MakeArmy();
	}
	
	public void printDescription() {
		System.out.println(k.getDescription());
		System.out.println(c.getDescription());
		System.out.println(k.getDescription());

	}
	
}

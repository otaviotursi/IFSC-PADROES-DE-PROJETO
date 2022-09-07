package creationals.prototype.exercise;

public class KingdomFactory {

	private King k;
	private Castle c;
	private Army a;
	
	public KingdomFactory(King king, Castle castle, Army army) {
		k = king;
		c = castle;
		a = army;
	}
	
	public King MakeKing() {
		return k.Clone();
	}
	
	public Castle MakeCastle() {
		return c.Clone();
	}
	
	public Army MakeArmy() {
		return a.Clone();
	}
	
	
	


}

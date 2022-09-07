package creationals.abstractFactory.exercise;

public class OrcKingdomFactory implements KingdomFactory{

	public Army CriarArmy() {
		return new OrcArmy();
	}
	public Castle CriarCastle() {
		return new OrcCastle();
	}
	public King CriarKing() {
		return new OrcKing();
	}
	
}

package creationals.abstractFactory.exercise;

public class ElfKingdomFactory implements KingdomFactory{
	
	@Override
	public Army CriarArmy() {
		return new ElfArmy();
	}
	@Override
	public Castle CriarCastle() {
		return new ElfCastle();
	}
	@Override
	public King CriarKing() {
		return new ElfKing();
	}
}

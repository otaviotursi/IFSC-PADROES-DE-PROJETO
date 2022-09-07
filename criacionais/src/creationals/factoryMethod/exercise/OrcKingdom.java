package creationals.factoryMethod.exercise;

public class OrcKingdom extends Kingdom {

	@Override
	King makeKing() {
		return new OrcKing();
	}

	@Override
	Castle makeCastle() {
		// TODO Auto-generated method stub
		return new OrcCastle();
	}

	@Override
	Army makeArmy() {
		// TODO Auto-generated method stub
		return new OrcArmy();
	}

}

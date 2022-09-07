package creationals.prototype.exercise;

public class MainDepois {
	public static void main(String[] args) {
		//Adicione (crie ou use do outro exercicio)
		// as classes que faltam
		Kingdom kingdom;
		
		// As operacoes da Factory deverao ser baseadas
		// em Clone, por exemplo:
		// public king createKing(){
		//    return _prototypeKing.Clone();
		// }
		// A interface king (e as outras), entao, devera suportar a operacao
		// Clone()
		
		// KingdomFactory criada com prototipos para Elf
		kingdom = new Kingdom(new KingdomFactory(
				new ElfKing(), 
				new ElfCastle(),
				new ElfArmy()));
		kingdom.printDescription();
	
		// KingdomFactory criada com prototipos para Orc 
		kingdom = new Kingdom(new KingdomFactory(
				new OrcKing(), 
				new OrcCastle(),
				new OrcArmy()));
		kingdom.printDescription();
	}
}
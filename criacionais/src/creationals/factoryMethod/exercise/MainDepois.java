package creationals.factoryMethod.exercise;

public class MainDepois {
	public static void main(String[] args) {
		// Esta classe Kingdom deve ser uma classe
		// com os seguintes factory methods:
		Kingdom kingdom;
		
		// A implementacao padrao pode retornar null 
		
		// Nao se esqueca de criar as interfaces King,
	    // Castle e Army
		
		kingdom = new ElfKingdom(); // Subclasse para Elf
		kingdom.printDescription();
	
		kingdom = new OrcKingdom(); // Subclasse para Orc
		kingdom.printDescription();
		
	}
}
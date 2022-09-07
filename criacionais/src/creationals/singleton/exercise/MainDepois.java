package creationals.singleton.exercise;

public class MainDepois {
	public static void main(String[] args) {
		Kingdom kingdom;
		
		// A classe KingdomFactory e suas subclasses sao 
		// Singleton. Isto implica:
		//  -- Construtor com visibilidade protected
		//  -- Metodo getInstance() com visibilidade public
		kingdom = new Kingdom(ElfKingdomFactory.getInstance());
		kingdom.getDescription();
	
		kingdom = new Kingdom(OrcKingdomFactory.getInstance());
		kingdom.getDescription();
	}
}
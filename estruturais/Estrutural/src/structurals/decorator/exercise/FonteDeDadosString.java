package structurals.decorator.exercise;

public class FonteDeDadosString implements FonteDeDados{

	private String dado;
	
	public FonteDeDadosString(String str) {
		this.dado = str;
	}
	
	@Override
	public String resultado() {
		return this.dado;
	}

}

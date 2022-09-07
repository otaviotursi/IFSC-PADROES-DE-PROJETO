package structurals.decorator.exercise;

public class CaixaAltaDecorator implements FonteDeDados{
	FonteDeDadosString fonteDadosString;
	
	public CaixaAltaDecorator(FonteDeDadosString fonteDeDadosString) {
		this.fonteDadosString = fonteDeDadosString;
	}

	@Override
	public String resultado() {
		return this.fonteDadosString.resultado().toUpperCase();
	}

}

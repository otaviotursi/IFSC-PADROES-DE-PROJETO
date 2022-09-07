
public class CaixaAltaDecorator extends FonteDeDadosDecorator{
	public CaixaAltaDecorator (FonteDeDados _dados) {
		super(_dados);
	}
	
	@Override
	public String resultado(){
		String string = super.resultado();
		String caixaAlta = string.toUpperCase();
		return caixaAlta;
	}
}
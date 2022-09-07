package structurals.decorator.exercise;

public class InverteDecorator implements FonteDeDados {

	CaixaAltaDecorator caixaAltaDecorator;
	
	public InverteDecorator(CaixaAltaDecorator caixaAltaDecorator) {
		this.caixaAltaDecorator = caixaAltaDecorator;
	}

	@Override
	public String resultado() {
		
		int len = this.caixaAltaDecorator.resultado().length()-1;
		String certo = this.caixaAltaDecorator.resultado().toString();	
		System.out.println(certo);
		int i = 0;
		String reverso = "";
		for(i=len; i>=0; i--){
			reverso += certo.charAt(i);
			
		}
		
		return reverso;
	}

}

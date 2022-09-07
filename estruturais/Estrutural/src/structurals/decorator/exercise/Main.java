 package structurals.decorator.exercise;

public class Main {
	public static void main(String[] args) {
		String str = "Padroes de projeto";

		//Voce deve implementar o Decorator para manipulacao
		//de Strings
		
		//A interface FonteDeDados ja esta implementada
		//A classe FonteDeDadosDecorator ja esta implementada
		
		//O que precisa ser implementado:
		// InverteDecorator: inverte a String
		// CaixaAltaDecorator: coloca String em caixa alta
		// FonteDeDadosString uma classe que implementa "FonteDeDados"
		// e armazena simplesmente uma String
		
		FonteDeDados fonte = new InverteDecorator(
				new CaixaAltaDecorator(new 
						FonteDeDadosString(str)));
		
		System.out.println(fonte.resultado());
		// Saida deve ser: OTEJORP ED SEORDAP
	}
}

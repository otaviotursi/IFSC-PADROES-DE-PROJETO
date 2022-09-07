package behavioral.strategy.sample;

public class Demo {

	public static void main(String[] args) {
		
		Payer p1 = new Payer(new PixPayment(), new EasterDiscounter());
		p1.pay(120);
	}
}

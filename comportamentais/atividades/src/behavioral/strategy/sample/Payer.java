package behavioral.strategy.sample;

public class Payer {

	private PaymentMethod method;
	private Discounter discounter;
	
	public Payer(PaymentMethod method, Discounter discounter) {
		this.method = method;
		this.discounter = discounter;
	}
	
	void pay(double value) {
		if(method.pay(discounter.applyDiscount(value))) {
			System.out.println("Successful payment");
		} else {
			System.out.println("Payment failure");
		}
	}
}

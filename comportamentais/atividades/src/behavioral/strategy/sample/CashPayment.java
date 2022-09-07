package behavioral.strategy.sample;

public class CashPayment implements PaymentMethod{

	@Override
	public boolean pay(double value) {
		System.out.printf("Paying %.2f with credit card\n", value);
		return true;
	}
}

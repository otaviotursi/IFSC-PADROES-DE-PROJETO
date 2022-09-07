package behavioral.strategy.sample;

public class PixPayment implements PaymentMethod{

	@Override
	public boolean pay(double value) {
		System.out.printf("Paying %.2f with Pix\n", value);
		return true;
	}
}

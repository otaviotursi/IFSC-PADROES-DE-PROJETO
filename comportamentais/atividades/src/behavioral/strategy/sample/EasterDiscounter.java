package behavioral.strategy.sample;

public class EasterDiscounter implements Discounter{

	@Override
	public double applyDiscount(double amount) {
		return amount*0.8;
	}

}

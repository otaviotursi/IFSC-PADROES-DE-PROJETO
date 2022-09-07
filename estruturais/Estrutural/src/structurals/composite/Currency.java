package structurals.composite;

public class Currency {

	private double value;
	
	public Currency(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void sum(Currency netPrice) {
		value+=netPrice.getValue();
	}

}

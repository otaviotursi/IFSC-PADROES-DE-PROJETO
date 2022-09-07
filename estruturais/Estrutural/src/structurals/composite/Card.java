package structurals.composite;

import java.util.Iterator;

public class Card extends Equipament {

	protected Card(String name) {
		super(name);
	}

	@Override
	public Watt Power() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currency NetPrice() {
		return new Currency(10);
	}

	@Override
	public Currency DiscountPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Equipament> CreateIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

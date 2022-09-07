package structurals.composite;

import java.util.Iterator;

public abstract class Equipament {

	private String _name;
	
	protected Equipament(String name) {
		this._name = name;
	}
	
	public String Name() {
		return _name;
	}
	
	public abstract Watt Power();
	public abstract Currency NetPrice();
	public abstract Currency DiscountPrice();
	public void Add(Equipament e) {}
	public void Remove(Equipament e) {};
	public abstract Iterator<Equipament> CreateIterator();
}

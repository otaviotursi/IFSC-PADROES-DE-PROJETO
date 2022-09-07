package structurals.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeEquipament extends Equipament{

	protected List<Equipament> _list;
	
	protected CompositeEquipament(String name) {
		super(name);
		_list = new ArrayList<Equipament>();
	}

	@Override
	public Watt Power() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currency NetPrice() {
		Currency total = new Currency(0);
		for (Iterator<Equipament> iterator = CreateIterator(); iterator.hasNext();) {
			Equipament e =  iterator.next();
			total.sum(e.NetPrice());
		}
		return total;
	}

	@Override
	public Currency DiscountPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Add(Equipament e) {
		_list.add(e);
	}

	@Override
	public void Remove(Equipament e) {
		_list.remove(e);
	}

	@Override
	public Iterator<Equipament> CreateIterator() {
		return _list.iterator();
	}

}

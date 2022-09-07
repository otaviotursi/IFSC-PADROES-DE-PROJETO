package structurals.composite.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CompositeEmployee implements Employee {

	protected List<Employee> list;
	int codigo;
	String nome;
	String cargo;
	
	public CompositeEmployee(int codigo, String nome, String cargo) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.list = new ArrayList<Employee>();
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		for (Iterator<Employee> iterator = CreateIterator(); iterator.hasNext();) {
			Employee e =  iterator.next();
			e.showEmployeeDetails();
			System.out.print("\nCod:"+codigo+" Nome:"+nome+" Cargo: "+cargo);
		}
	}
	

	@Override
	public void addEmployee(Employee e) {
		this.list.add(e);
	}

	@Override
	public void removeEmployee(Employee e) {
		this.list.remove(e);
	}

	@Override
	public Iterator<Employee> CreateIterator() {
		return this.list.iterator();
	}
}

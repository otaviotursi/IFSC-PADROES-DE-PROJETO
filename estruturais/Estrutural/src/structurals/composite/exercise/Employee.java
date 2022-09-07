package structurals.composite.exercise;

import java.util.Iterator;

public interface Employee {
	
	public void showEmployeeDetails();
	public void addEmployee(Employee e);
	public void removeEmployee(Employee e);
	Iterator<Employee> CreateIterator();
}

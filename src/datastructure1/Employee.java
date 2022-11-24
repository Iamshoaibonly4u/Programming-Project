package datastructure1;

public class Employee {
	String name;
	int eid;
	double sal;
	
	public Employee(String name, int eid, double sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
	
	
}

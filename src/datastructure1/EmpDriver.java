package datastructure1;

import java.util.ArrayList;

public class EmpDriver {

	public static void main(String[] args) {
		Employee e1=new Employee("Shoaib",99,600000.00);
		Employee e2=new Employee("Faizan",109,700000.00);
		Employee e3=new Employee("Chitra",90,500000.00);
		
		ArrayList a=new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		System.out.println(a);
	}

}

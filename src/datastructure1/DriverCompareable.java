package datastructure1;

import java.util.ArrayList;
import java.util.Collections;

public class DriverCompareable {

	public static void main(String[] args) {
		Comp e1=new Comp("Zubair",99);
		Comp e2=new Comp("Faizan",109);
		Comp e3=new Comp("Vaibhav",90);
		
		ArrayList a=new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		System.out.println(a);
			
		Collections.sort(a);
		System.out.println(a);
		
	}

}

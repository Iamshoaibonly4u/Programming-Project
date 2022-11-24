package datastructure1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add(34);
		l.add(54);
		l.add(65);
		l.add(55);
		l.add(58);
		
		ArrayList a=new ArrayList(l);

		Collections.sort(a);
		for(Object i:a)
		{
			System.out.println(i);
		}
	}
}

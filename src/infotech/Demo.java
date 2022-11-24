package infotech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Demo {

	public static void main(String[] args) {
		
		String str="I am am shoaib shoaib";
		String[] s1=str.split(" ");
		Set<String> set=new LinkedHashSet<>();
		
		for(String st:s1)
		{
			set.add(st);
		}
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			String element=it.next();
			System.out.print(element+ " ");
		}
}
}

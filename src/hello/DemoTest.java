package hello;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		
		String str="aaabccdddd";
		char[] ch=str.toCharArray();
		int count=1;
		Map<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			
			if(!map.containsKey(ch[i]))
				map.put(ch[i], count);
			else
				map.put(ch[i], map.get(ch[i])+1);
		}
		
		for(Entry<Character, Integer> set:map.entrySet())
		{
			System.out.println(set);
		}
		
	

	}
}
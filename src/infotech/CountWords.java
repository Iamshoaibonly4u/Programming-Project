package infotech;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountWords {

	public static void main(String[] args) {
//		String str="i am java java i love java java";
//		Map<String,Integer> map=new HashMap<String,Integer>();
//		int count=1;
//		String[] arr=str.split(" ");
//		for(int i=0; i<arr.length; i++)
//		{
//			if(!map.containsKey(arr[i]))
//				map.put(arr[i], count);
//		else 
//			map.put(arr[i], map.get(arr[i])+1);
//		}
//		for(String x:map.keySet()) {
//			System.out.println("the count of word: "+x+" = "+map.get(x));
//		}
		
		
		
		String str="java is good java is good programming language";
		String[] arr=str.split(" ");
		Map<String, Integer> map=new HashMap<String,Integer>();
		int count=1;
		for(int i=0; i<arr.length; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(String s:map.keySet())
		{
			System.out.println("count of word is  :"+s+" ===>> "+map.get(s));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

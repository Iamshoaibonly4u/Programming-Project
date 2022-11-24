package hello;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class A {

	public static void main(String[] args) {
//		int a=12312323;
//		int sum=0;
//		int temp=a;
//		while(a!=0)
//		{
//			int ld=a%10;
//			sum=sum*10+ld;
//			a=a/10;
//		}
//		if(sum==temp)
//			System.out.println("its palindrome no.");
//		else
//			System.out.println("it is not a palindrome no.");
		
		
//		int n=12;
//		int count=0;
//		for(int i=2; i<n/2; i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//				break;
//			}
//		}
//		if(count>0)
//			System.out.println("it is not a prime no.");
//		else
//			System.out.println("its a prime no.");
		
		//Practice set
		
		
//		String str="i am learning learning java java";
//		String[] arr=str.split(" ");
//		int count=1;
//		Map<String, Integer> map=new HashMap<String,Integer>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(!map.containsKey(arr[i]))
//				map.put(arr[i], count);
//			else
//				map.put(arr[i], map.get(arr[i])+1);
//		}
		
		
		
//		
//		for(String set:map.keySet())
//		{
//			System.out.println("count of wordds    "+set+"----"+map.get(set));
//		}
		
		
		
		
//		String str="java is a programming language";
//		
//		int Count=str.length()-str.replace("a", "").length();
//		
//		System.out.println(Count);
		
		
		
		
		
//		if(System.out.printf("hello world",null) != null)
//		{
//			
//		}
		
		
		
		
//		String str="laptop";
//		char[] arr=str.toCharArray();
//		int count=1;
//		Map<Character, Integer> map=new HashMap<Character,Integer>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(!map.containsKey(arr[i]))
//				map.put(arr[i], count);
//			else
//				map.put(arr[i], map.get(arr[i])+1);
//		}
//		
//		for(char set:map.keySet())
//		{
//			if(map.get(set)>1)
//			System.out.println("duplicate words    "+set+"----"+map.get(set));
//			break;
//		}
		
		
		
		
//		String str1="army";
//		String str2="mary";
//		
//		char[] ch1=str1.toLowerCase().toCharArray();
//		char[] ch2=str2.toLowerCase().toCharArray();
//		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		if(Arrays.equals(ch1, ch2))
//			System.out.println("anagram");
//		else
//			System.out.println("not");
//		
		
		
		
		
//		String str="swiss";
//		char[] arr=str.toCharArray();
//		int count=1;
//		Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(!map.containsKey(arr[i]))
//				map.put(arr[i], count);
//			else
//				map.put(arr[i], map.get(arr[i])+1);
//		}
//		
//		for(Entry<Character,Integer> set:map.entrySet())
//		{
//			if(set.getValue()==1)
//			{
//			System.out.println("count of first non repeated character    "+set.getKey());
//			break;
//			}
//		}
		
		
		
		
//		String str="www.facebook.com";
//		
//		String first=str.substring(0, 4);
//		String last=str.substring(str.length()-4,str.length());
//		String mid=str.substring(4, str.length()-4);
//		
//		System.out.println(first);
//		System.out.println(last);
//		System.out.println(mid);
		
		
		
		
//		int[] arr= {3,4,56,334,6};
//		
//		int max=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
		
		
		
//		String str="java is good";
//		String[] arr=str.split(" ");
//		for (int i = arr.length-1; i >=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
//		
//		String str="java is good";
//		char[] ch=str.toCharArray();
//		for (int i = ch.length-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
//		
//		int[] arr= {1,2,3,5,6,7,8,9,10};
//		int sumArr=0;
//		int sumNatural=0;
//		for (int i = 0; i < arr.length; i++) {
//			sumArr=sumArr+arr[i];
//		}
//		for(int i=0; i<=10; i++)
//		{
//			sumNatural=sumNatural+i;
//		}
//		
//		int count=sumNatural-sumArr;
//		System.out.println(count);
		
		
		
//		int[] arr= {32,45,65,32,76,5,4,33};
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.print(arr[i]+" ");
//		}
	
		
	
//		int[] arr= {32,45,65,32,76,5,4,33};
//		HashSet<Integer> hs=new HashSet<>();
//		for(int a:arr)
//		{
//			if(!hs.add(a))
//			{
//				System.out.println("Duplicate element is  "+a);
//			}
//		}
		
		
//		
//		int[] arr= {32,45,65,32,76,5,4,33};
//		int count=1;
//		HashMap<Integer, Integer> hm=new HashMap<>();
//		for(int a:arr)
//		{
//			if(!hm.containsKey(a))
//			{
//				hm.put(a, count);
//			}else {
//				hm.put(a, hm.get(a)+1);
//			}
//		}
//		
//		for(int set:hm.keySet())
//		{
//			if(hm.get(set)>1) {
//			System.out.println("duplicate is  "+set);
//			}
//		}
		
		
		
		
//		String str="i am am shoaib shoaib";
//		String[] arr=str.split(" ");
//		Set<String> set=new LinkedHashSet<>();
//		for(String string:arr)
//		{
//			set.add(string);
//		}
//		
//		Iterator it=set.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next()+" ");
//		}
		
		
//		
//		int[] a= {2,4,45,6};
//		int[] b= {43,6,4,3};
//		
//		int[] c=new int[a.length+b.length];
//		
//		int count=0;
//		for(int i=0; i<a.length; i++)
//		{
//			c[count]=a[i];
//			count++;
//		}
//		for(int i=0; i<b.length; i++)
//		{
//			c[count]=b[i];
//			count++;
//		}
//		
//		for(int i=0; i<c.length; i++)
//		{
//			System.out.print(c[i]+" ");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}

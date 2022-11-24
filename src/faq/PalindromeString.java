package faq;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String actual=str;
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
			s=s+str.charAt(i);
		}
		if(actual.equals(s))
			System.out.print("palindrome String "+s);
		else
			System.out.print("not a palindrome string "+s);
	}

}

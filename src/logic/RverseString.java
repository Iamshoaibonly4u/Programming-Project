package logic;

import java.util.Scanner;

public class RverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("write your name ");
		String s1=sc.next();
		String s2=" ";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		s2=s2.trim();
		System.out.println(s2);
	}
}

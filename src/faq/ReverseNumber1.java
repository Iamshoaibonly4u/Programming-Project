package faq;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int reverse=0;
		while(n!=0)
		{
			reverse= reverse*10 + n%10; 
			n=n/10;
		}
		System.out.println(reverse);
		
	}

}

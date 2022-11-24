package javaforselenium;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if(rs==true)
			System.out.println("prime number");
		else
			System.out.println("not prime");
	}

	 static boolean isPrime(int n) {
		 for(int i=2; i<n/2; i++)
		 {
			 if(n%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
	}

}

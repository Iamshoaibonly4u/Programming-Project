package javamk;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int s=sc.nextInt();
		boolean rs=isPrime(s);
		if(rs==true)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

	 static boolean isPrime(int n) {
		 for(int i=2;i<n/2;i++)
		 {
			 if(n%i==0)
				 return false;
		 }
				 return true;
	}
}

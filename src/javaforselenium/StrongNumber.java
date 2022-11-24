package javaforselenium;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+isStrong(r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("strong");
		else
			System.out.println("not");
		
	}

	 static int isStrong(int r) {
		int fact=1;
		while(r!=0) {
			fact=fact*r;
			r--;
		}
		return fact;
	}

}

package javamk;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int  rs=isDivisor(n);
		System.out.println(rs);
	}

	private static int isDivisor(int n) {
		int count=0;
		for(int i=1;i<n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		return count;
	}

}

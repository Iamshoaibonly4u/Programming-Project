package javainterview;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int rs = isFact(n);
		System.out.println(rs);
	}

	private static int isFact(int n) {
		int sum=1;
		while(n!=0)
		{
			sum=sum*n;
			n--;
		}
		return sum;
	}

}

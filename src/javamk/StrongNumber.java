package javamk;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean  rs=isStrong(n);
		System.out.println(rs);
	}

	private static boolean isStrong(int n) {
		int sum=0, temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+isfact(r);
			n=n/10;
		}
		return sum==temp;
	}

	private static int isfact(int r) {
		int fact=1;
		while(r!=0)
		{
			fact=fact*r;
			r--;
		}
			return fact;
	}

}

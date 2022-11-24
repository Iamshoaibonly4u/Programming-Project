package practice1;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean rs=isStrong(n);
		System.out.println(rs);
		
	}

	private static boolean isStrong(int n) {
		int sum=0, temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		return sum==temp;
	}

	private static int fact(int r) {
		int f=1;
		while(r>0)
		{
			f=f*r;
			r--;
		}
		return f;
	}

}

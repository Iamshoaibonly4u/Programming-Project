package javamk;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean rs=isHappy(n);
		System.out.println(rs);
	}

	 static boolean isHappy(int n) {
		while(n>9) 
		{
		 int sum=0;
		 do
		 {
			 int r=n%10;
			 sum=sum+r*r;
			 n=n/10;
		 }while(n!=0);
		 n=sum;
		}
		 return n==1|n==7;
	}

}

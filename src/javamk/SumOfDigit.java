package javamk;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Digit");
		int s=sc.nextInt();
		int rs=sumOfDigit(s);
		System.out.println(rs);
	}
	 static int sumOfDigit(int n) 
	 {
		 int sum=0;
		 while(n!=0)
		 {
			int r =n%10;
			 sum=sum+r;
			 n=n/10;
		 }
		return sum;
	}
}

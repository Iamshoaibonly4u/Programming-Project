package javamk;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int  rs=isPrimeDigit(n);
		System.out.println(rs);
	}

	 static int isPrimeDigit(int n) {
		 int count=0;
		while(n!=0)
		{
			int r=n%10;
			if(r==1||r==2||r==3||r==5||r==7);
			{
			count++;
			}
			n=n/10;
		}
		 return count;
	}

}

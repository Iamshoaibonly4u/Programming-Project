package javamk;

import java.util.Scanner;

public class SquareOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rs=isSquare(n);
		System.out.println(rs);
	}

	 static int isSquare(int n) {
		 int sum=0;
		 while(n!=0)
		 {
			 int r=n%10;
			 sum=sum+r*r;
			 n=n/10;
		 }
		 return sum;
	}

}

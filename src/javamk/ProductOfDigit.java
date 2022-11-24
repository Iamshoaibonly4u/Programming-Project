package javamk;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Digit");
		int s=sc.nextInt();
		int rs=productOfDigit(s);
		System.out.println(rs);
	}

	 static int productOfDigit(int n) 
	 {
		 int p=1;
		 while(n!=0)
		 {
			 int r=n%10;
			 p=p*r;
			 n=n/10;
		 }
		return p;
	}

}

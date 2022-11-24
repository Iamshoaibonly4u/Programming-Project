package javamk;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int f=sc.nextInt();
		int rs=isFact(f);
		System.out.println(rs);
	}

	 static int isFact(int n) 
	 {
		 int fact=1;
		 while(n>1)
		 {
			 fact=fact*n;
			 n--;
		 }
		 return fact;
	}

}

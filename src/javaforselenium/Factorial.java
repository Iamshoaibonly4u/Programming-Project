package javaforselenium;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int rs=isFact(n);
		System.out.println(rs);

	}

	 static int isFact(int n) {
		 int ft=1;
		while(n!=0)
		{
			ft=ft*n;
			n--;
		}
		return ft;
	}

}

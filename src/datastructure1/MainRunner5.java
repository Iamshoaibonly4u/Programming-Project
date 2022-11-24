//Factorial of n using recursion.
package datastructure1;

import java.util.Scanner;

public class MainRunner5 
{
	 static int fact(int n) {
		if(n==0&&n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rs=fact(n);
		System.out.println(rs);
	}
}

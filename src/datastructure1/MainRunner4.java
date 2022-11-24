//Sum of first n natural numbers using recursion.
package datastructure1;

import java.util.Scanner;

public class MainRunner4 {


	 static int sumOfNat(int n) {
		if(n==0)
			return 0;
		return n+sumOfNat(n-1);
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rs=sumOfNat(n);
		System.out.println(rs);
	}

}

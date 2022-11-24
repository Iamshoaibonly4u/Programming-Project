//WAPTP number from 1 to n.
package datastructure1;

import java.util.Scanner;

public class MainRunner3 {


	 static void printing(int n) {
		if(n>1)
			printing(n-1);
		System.out.println(n);
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		printing(n);
	}

}

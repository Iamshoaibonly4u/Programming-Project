//WAPTP number from x to 1.
package datastructure1;

import java.util.Scanner;

public class MainRunner2 
{
	 static void printing(int x) {
		if(x==0)
			return ;
		System.out.println(x+" ");
	  printing(x-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number");
		int x=sc.nextInt();
		printing(x);
	}

	

}

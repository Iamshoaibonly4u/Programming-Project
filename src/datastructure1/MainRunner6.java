//Count of digits present in number using recursion.
package datastructure1;

import java.util.Scanner;

public class MainRunner6 {

	 static int countDigits(int x) {
		if(x>-9&&x<9)
			return 1;
		return 1+countDigits(x/10);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int rs=countDigits(x);
		System.out.println(rs);
	}

	
}

//Sum of digits present in number using recursion.
package datastructure1;

import java.util.Scanner;

public class MainRunner7 {

	static int sumOfDigits(int x) {
		if(x>-9&&x<9)
			return x;
		return x%10+sumOfDigits(x/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int rs=sumOfDigits(x);
		System.out.println(rs);
	}


}

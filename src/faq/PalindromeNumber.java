package faq;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0)
		{
			rev= rev*10 + n%10;
			n=n/10;
		}
		if(rev==temp)
			System.out.println("palindrome number "+rev);
		else
			System.out.println("not a palindrome number "+rev);
	}

}

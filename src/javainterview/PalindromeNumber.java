package javainterview;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String rs = isPalindrome(n);
		System.out.println(rs);
	}

	private static String isPalindrome(int n) {
		int temp=n, rev=0;
		do {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
		if(rev==temp)
			return "Palindrome";
		else
		return "NotPalindrome";
	}

}

package javamk;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int s=sc.nextInt();
		boolean rs=isPalindrome(s);
		if(rs==true)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}

	 static boolean isPalindrome(int n) {
		 int rev=0 ; int temp=n;
		 do {
			 int r=n%10;
			 rev=rev*10+r;
			 n=n/10;
			
		} while (n!=0);
		 if(rev==temp)
			 return true;
		 else
		 return false;
	}

}

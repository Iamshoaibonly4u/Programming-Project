package javaforselenium;

import java.util.Scanner;

public class PlaindromeOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string value");
		String str=sc.nextLine();
		boolean rs=isPalindrome(str);
		if(rs==true)
			System.out.println("String is palindrome");
		else
			System.out.println("Strinng is not palindrome");
	}

	 static boolean isPalindrome(String str) {
		 int i=0,j=str.length()-1;
		 while(i<j)
		 {
			 if(str.charAt(i)!=str.charAt(j))
				 return false;
			 i++;
			 j--;
		 }
		 
		 return true;
	}

}

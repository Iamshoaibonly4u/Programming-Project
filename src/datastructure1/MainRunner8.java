//DAMTR true if the string is palindrome otherwise return false.
package datastructure1;

import java.util.Scanner;

public class MainRunner8 {
	
	static boolean isPalindrome(String st) {
		int i=0, j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=sc.nextLine();
		boolean rs=isPalindrome(st);
		System.out.println(rs);
		
	}

}

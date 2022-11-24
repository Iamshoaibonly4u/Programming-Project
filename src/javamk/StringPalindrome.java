package javamk;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		boolean rs=isPalindrome(st);
		System.out.println(rs);
	}

	 static boolean isPalindrome(String st) {
		 int i=0; int j=st.length()-1;
		 while(i<j)
		 {
			 if(st.charAt(i)!=st.charAt(j))
				 return false;
						 i++;
			 j--;
		 }
		 return true;
	}

}

package javamk;

import java.util.Scanner;

public class StringAlphaPresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='a'||ch=='A')
			{
				count++;
				break;
			}
		}
		if(count>0)
			System.out.println("A is present");
		else
			System.out.println("A is not present");
	}

}

package javaforselenium;

import java.util.Scanner;

public class FindStringLikeUcLc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		String str=sc.nextLine();
		int uc=0,lc=0,dc=0,spc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				lc++;
			}
				
			else if(ch>='A' && ch<='Z') 
			{
				uc++;
			}
			else if(ch>='0' && ch<='9') 
			{
				dc++;
			}
			else 
			{
				spc++;
			}
		}
		System.out.println("lowercase"+lc);	
		System.out.println("uppercase"+uc);
		System.out.println("digit"+dc);
		System.out.println("special"+spc);
	}

}

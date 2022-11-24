package javamk;

import java.util.Scanner;

public class StringUpperLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					 ch[i]=(char)(ch[i]+32);
				}
			else if(ch[i]>='a'&&ch[i]<='z')
				{
					 ch[i]=(char)(ch[i]-32);
				}
		}
		st=new String(ch);
		System.out.println(st);
	}
}

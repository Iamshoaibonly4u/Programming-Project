package javamk;

import java.util.Scanner;

public class StringVowelCons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		String st=sc.next();
		int vc=0, cc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println(vc);
		System.out.println(cc);
	}

}

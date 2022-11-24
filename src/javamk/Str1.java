package javamk;

import java.util.Iterator;

public class Str1 {

	public static void main(String[] args) {
		String s="hasdsjdaaa";
		char[] ch=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

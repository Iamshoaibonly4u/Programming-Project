package javaforselenium3;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		String str="shoaib";
		int count=0;
		for(char ch:str.toCharArray())
		{
			count++;
		}
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}

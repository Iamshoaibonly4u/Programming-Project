package javaforselenium3;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arrays");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n-2]);
	}
}
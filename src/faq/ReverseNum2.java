package faq;

import java.util.Scanner;

public class ReverseNum2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}

}

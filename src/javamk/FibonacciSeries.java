package javamk;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int firstTerm=0; int secondTerm=1;
		for(int i=0;i<=n;i++)
		{
			System.out.print(firstTerm+",");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
	}

}

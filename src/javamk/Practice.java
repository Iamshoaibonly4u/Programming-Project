package javamk;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int first=0; int second=1;
		for(int i=0;i<=n;i++)
		{
			System.out.print(first+",");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}


package javamk;

import java.util.Scanner;

public class ArmStrong1 
{
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	public static int power(int x,int y)
	{
		int pow=1;
		while(y>0)
		{
		  pow=pow*x;
		  y--;
		}
		return pow;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int num=sc.nextInt();
		int temp=num;
		int c=count(num);
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+power(ld,c);
			num=num/10;
		}
			if(sum==temp)
				System.out.println("Armstrong");
			else
				System.out.println("not Armstrong");
	}
}
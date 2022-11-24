package practice1;

import java.util.Scanner;

public class ReadArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius");
		int n=sc.nextInt();
		int temp=n;
		int c=isCount(n);
		int ld=0;
		int sum=0;
		while(n>0)
		{
			ld=n%10;
			sum=sum+power(ld,c);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("armstrong");
		else
			System.out.println("not");
		
	}

	private static int power(int ld, int c) {
		int pow=1;
		while(c>0)
		{
			pow=pow*ld;
			c--;
		}
		return pow;
	}

	private static int isCount(int n) {
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}		
}
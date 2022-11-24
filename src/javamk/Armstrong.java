package javamk;
	
import java.util.Scanner;

public class Armstrong {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean rs=isArmstrong(n);
		System.out.println(rs);
	}
	 static boolean isArmstrong(int n) {
		int sum=0;int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==temp)
			return true;
		else			
			return false;
	}
}

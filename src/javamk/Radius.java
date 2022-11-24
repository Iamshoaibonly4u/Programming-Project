package javamk;

import java.util.Scanner;

public class Radius 
{

	 static double isArea(double x) 
	 {
		 x=3.14*x*x;
		return x;
	}
	  static double isCircum(double rs1) 
	  {
			rs1=2*3.14*rs1;
			return rs1;
		}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of a circle : ");
		int r=sc.nextInt();
		double rs=isArea(r);
		double rs1=isCircum(r);
		System.out.println(rs);
		System.out.println(rs1);
	}


	
}

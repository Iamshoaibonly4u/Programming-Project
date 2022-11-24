package infotech;

import java.util.Scanner;

public class Requirement {
	public static void test() {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------WELCOME!!!--------");
		System.out.println("press 1 to add 2 numbers");
		System.out.println("press 2 to add 3 numbers");
		System.out.println("press 3 to add 4 numbers");
		int a=sc.nextInt();
		
		if(a==1) {
			System.out.println("Enter 2 numbers to be added");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int sum=x+y;
			System.out.println("Sum is :"+ sum);
		} else if(a==2) {
			System.out.println("Enter 3 numbers to be added");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			int sum=x+y+z;
			System.out.println("Sum is :"+ sum);
		}else if(a==3) {
			System.out.println("Enter 4 numbers to be added");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			int z1=sc.nextInt();
			int sum=x+y+z+z1;
			System.out.println("Sum is :"+ sum);
		}
		System.out.println("press 1 to continue");
		System.out.println("press any other number to stop");
		int b=sc.nextInt();
		if(a==1) {
			test();
		}else {
			System.out.println("---- THANK YOU----");
		}
	}

	public static void main(String[] args) {
		test();

	}

}

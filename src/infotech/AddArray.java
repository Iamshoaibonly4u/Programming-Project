package infotech;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five arrays integer value = : ");
		
		int[] n=new int[5];
		
		for(int i=0; i<n.length ;i++)
		{
			n[i]=sc.nextInt();
		}
		for(int i=0; i<n.length; i++)
		{
			System.out.println("Enter "+i+" index : "+n[i]);
		}
		
		
		

	}

}

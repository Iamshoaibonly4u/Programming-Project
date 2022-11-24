package javamk;

import java.util.Scanner;

public class Publik 
{
	 static int fun(int x)
	{
		if(x==0)
			return 0;
		else
		{
			return 1+fun(x-1);
		}
		
	}
	 
	public static void main(String[] args) {
	int rs=fun(6);
	System.out.println(rs);
	
	}
}

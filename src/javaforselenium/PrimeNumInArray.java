package javaforselenium;

public class PrimeNumInArray {

	public static void main(String[] args) {
		int []a= {23,45,67,31,89,63};
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			boolean rs=isPrime(a[i]);
			if(rs==true) {
				count++;
			}
		}
		System.out.println("prime numbers are "+count);
	}

	 static boolean isPrime(int x) {
		 for(int i=2; i<x/2; i++)
		 {
			 if(x%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
	}

}

package javainterview;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		int a[]= {23,41,45,67,32,47,59,87};
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			boolean rs=isPrime(a[i]);
			if(rs==true)
			{
				count++;
			}
		}
		System.out.println("number of prime number  "+count);
		
}

	 static boolean isPrime(int x) {
		for(int i=2; i<x/2; i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}
}

package javaforselenium;

public class CountDigitOfUrName {

	public static void main(String[] args) {

		int num=342345;
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum*10+ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}

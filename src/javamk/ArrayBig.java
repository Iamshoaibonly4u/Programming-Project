package javamk;

public class ArrayBig {

	public static void main(String[] args) {
		int a[]= {32,45,66,13,54,97,87};
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}

}

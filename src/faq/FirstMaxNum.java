package faq;

public class FirstMaxNum {

	public static void main(String[] args) {
		int a[]= {221,34,443,555,32,422};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

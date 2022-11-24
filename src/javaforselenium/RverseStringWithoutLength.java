package javaforselenium;

public class RverseStringWithoutLength {

	public static void main(String[] args) {
		String str="nooriza";
		char ch[]=str.toCharArray();
		int count=0;
		for(char i:ch)
		{
			count++;
		}
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
	}

}

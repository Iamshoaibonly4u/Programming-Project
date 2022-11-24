package javaforselenium2;

public class PalindromeOfString {

	public static void main(String[] args) {
		String str="malayalam";
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
			s=s+str.charAt(i);
		}
		if(s.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

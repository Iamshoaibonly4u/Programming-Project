package faq;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="shoaibakhtar";
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println(s);
	}

}

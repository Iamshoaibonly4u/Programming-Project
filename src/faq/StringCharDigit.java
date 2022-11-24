package faq;

public class StringCharDigit {

	public static void main(String[] args) {
		
		String str="a1b2c3";
		String letter="";
		String digit="";
		for(int i=0; i<str.length(); i++)
		{
		if(Character.isLetter(str.charAt(i)))
			letter=letter+str.charAt(i);
		else if(Character.isDigit(str.charAt(i)))
			digit=digit+str.charAt(i);
		}
		System.out.println(letter+" "+digit);
	}
}

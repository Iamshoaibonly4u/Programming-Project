package faq;

public class NumberOfOccurance {

	public static void main(String[] args) {
		String str="java is a object oriented programming language";
		
		int actual_length=str.length();
		
		int dummy_length=str.replace("o","").length();
		
		int count=actual_length-dummy_length;
		
		System.out.println(count);
		
		
	}

}

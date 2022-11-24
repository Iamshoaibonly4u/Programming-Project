package faq;

public class CountDigitOfUrName {

	public static void main(String[] args) {
		String str="shoaib";
		int count=0;
		for(char ch:str.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}

}

package javaforselenium2;

public class CountDigitofurname {

	public static void main(String[] args) {
		String str="shoaib";
		int count=0;
		char ch[]=str.toCharArray();
		for(char i:ch)
		{
			count++;
		}
		System.out.println(count);
	}

}

package javaforselenium;

public class LcCharPresentInString {

	public static void main(String[] args) {
		String str="SAFDdffffNA";
		int count=0;
//		char ch[]=str.toCharArray();
//		for(int i=0; i<ch.length; i++)
//		{
//			if(ch[i]>='a'&&ch[i]<='z')
//			count++;
//		}
//		System.out.println(count);
		
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

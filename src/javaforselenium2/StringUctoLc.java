package javaforselenium2;

public class StringUctoLc {

	public static void main(String[] args) {
		String str="SHOAIB";
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		str=new String(ch);
		System.out.println(str);
	}

}

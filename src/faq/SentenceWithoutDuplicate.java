package faq;

import java.util.LinkedHashSet;

public class SentenceWithoutDuplicate {

	public static void main(String[] args) {
		String str="this is pathaan show time pathaan mania is back";
		String[] s=str.split(" ");
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		for(String word:s)
		{
			l.add(word);
		}
		for(String word2:l)
		{
			int count=0;
			for(String word3:s) {
				if(word3.equals(word2))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(word2+" "+count);
		}
	}
}

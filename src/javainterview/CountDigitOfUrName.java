package javainterview;

public class CountDigitOfUrName {

	public static void main(String[] args) {
		String s="ShoaibAkhtar";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' || ch==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

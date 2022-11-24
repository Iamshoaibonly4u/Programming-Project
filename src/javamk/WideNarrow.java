package javamk;

public class WideNarrow {

	public static void main(String[] args) {
		int i=10;
		double d=i;//widening
		long l=121;
		char ch=(char)l;//Narrowing
		System.out.println(d);
		System.out.println(ch);	
	}
}

package logic;

public class Recursion {
	
	static void test(int a)
	{
		if(a>0)
			test(a-1);
		System.out.println(a);
	}
	public static void main(String[] args) {
		test(5);
		
	}

}

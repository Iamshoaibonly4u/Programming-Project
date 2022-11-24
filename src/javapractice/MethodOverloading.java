package javapractice;

public class MethodOverloading {
	
	public void test(int a)
	{
		System.out.println("from test a");
	}
	
	public void test(int a,int b)
	{
		System.out.println("from test b");
	}
	
	public void test(int a, double b)
	{
		System.out.println("from test c");
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test(1);
		m.test(2, 4.4);
		m.test(3, 60);

	}

}

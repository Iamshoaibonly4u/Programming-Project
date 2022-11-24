package javamk;

public class CompileTimePolymorphism {
	public static void test1(int i, int j)
	{
		System.out.println("from test1");
	}
	public static void test1(int a,double b)
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		CompileTimePolymorphism.test1(12, 12.5);
		CompileTimePolymorphism.test1(34, 55);
	}
}

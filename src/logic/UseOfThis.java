package logic;

public class UseOfThis {
	String name;
	double sal;
	
	UseOfThis(String name, double sal)
	{
		this.name=name;
		this.sal=sal;
	}
	void test() {
		System.out.println(name+" "+sal);
	}
	public static void main(String[] args) {
		UseOfThis a=new UseOfThis("shoaib",100.00);
		a.test();
	
	}
}

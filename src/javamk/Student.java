package javamk;

public class Student {
	private int roll ;
	private String name;
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	void test()
	{
		System.out.println(roll+" "+name);
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	
	
}

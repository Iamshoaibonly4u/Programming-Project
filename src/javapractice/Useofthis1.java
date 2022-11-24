package javapractice;

public class Useofthis1 {
	
	int eid;
	String name;
	public Useofthis1(int eid, String name) 
	{
		this.eid=eid;
		this.name=name;
	}
	void test()
	{
		System.out.println(eid+" "+name);
	}
	
	public static void main(String[] args) {
		Useofthis1 u=new Useofthis1(55,"shoaib");
		u.test();
	}
}

package javapractice;

public class Encapsulation {

	private String name;
	private int eid;
	
	public String getName()
		{
			return name;
		}
		
	public void setName(String name)	
	{
		this.name=name;
	}
	public int getEid()
	{
		return eid;
	}
	
	public static void main(String args[])
	{
		Encapsulation e=new Encapsulation();
		e.setName("shoaib");
		System.out.println(e.getEid());
		System.out.println(e.getName());
	}
}

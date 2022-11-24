package logic;

public class Encaps2 {
	private String name;
	private int roll;
	
	Encaps2(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}

	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	void test() {
		System.out.println("what do you want");
	}
	
}

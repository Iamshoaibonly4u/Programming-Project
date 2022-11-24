package logic;

public class Encaps {
	public static void dispaly(Encaps2 e1)
	{
		System.out.println("name is "+e1.getName());
		System.out.println("roll is "+e1.getRoll());
	}

	public static void main(String[] args) {
		Encaps2 e=new Encaps2("Shoaib",100);
		e.setRoll(101);
		dispaly(e);
		e.test();
		
		
	}

}

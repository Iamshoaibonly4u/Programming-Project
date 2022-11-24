package javamk;

public class UpAndDownCasting {

	public static void main(String[] args) {
		A obj1=new B();//upcasting
		System.out.println(obj1.i);
		B obj2=(B)obj1;//downcasting
		System.out.println(obj2.i);
		System.out.println(obj2.i);
		System.out.println(obj2.j);

//		C obj3=(C)obj2;
//		 System.out.println(obj3.k);//ClassCastException
		
	}
}

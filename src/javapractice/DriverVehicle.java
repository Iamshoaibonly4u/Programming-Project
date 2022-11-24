package javapractice;

public class DriverVehicle {

	public static void main(String[] args) {
		Car c=new Car();
		c.move();
		Vehicle v=c;
		v.move();
		Train v1=(Train)v;
		v1.move();
	}

}

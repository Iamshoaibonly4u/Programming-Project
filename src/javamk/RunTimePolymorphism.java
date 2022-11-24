package javamk;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.move();
		Animal a=d;
		a.move();
	}

}

package logic;

public class Driver1 {

	public static void main(String[] args) {
		DebitCard d=new DebitCard();
		Card c1=(DebitCard)d;
		SwipeMachine sw=new SwipeMachine();
		d.makePayement();
		sw.makePayement(c1);
	}

}

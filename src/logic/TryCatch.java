package logic;

public class TryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
		}
		catch (ArithmeticException e) {
			System.out.println("exception is handled");
			e.printStackTrace();
		}
	}

}

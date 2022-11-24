package logic;

public class Comp {
		void test(int a) {
			System.out.println("from test 1");
		}
		void test(int a, double b) {
			System.out.println("from test 2");
		}
		void test(int a, int b) {
			System.out.println("from test 3");
		}

	public static void main(String[] args) {
		Comp obj=new Comp();
		obj.test(10);
		obj.test(10, 19.5);
		obj.test(5, 6);
		
	}

}

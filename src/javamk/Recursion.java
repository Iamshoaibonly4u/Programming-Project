package javamk;

public class Recursion {

	public static void main(String[] args) {
		int n=fact(5);
		System.out.println(n);
	}

	 static int fact(int i) {
		 if(i==0||i==1)
			 return 1;
		 return i*fact(i-1);
	}

}

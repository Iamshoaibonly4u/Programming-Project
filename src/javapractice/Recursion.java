package javapractice;

public class Recursion {

	public static void main(String[] args) {
		int a=isFact(5);
		System.out.println(a);

	}

	 static int isFact(int i) {
		if(i==0||i==1)
			return 1;
		return i*isFact(i-1);
	}

}

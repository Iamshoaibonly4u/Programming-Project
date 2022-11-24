package faq;

public class BiggestAmongThreeNumbers {

	public static void main(String[] args) {
		int a=30;
		int b=60;
		int c=89;
		if(a>b && a>c )
			System.out.println("a is the biggest number "+a);
		else if(b>c)
			System.out.println("b is the biggest number"+b);
		else
			System.out.println("c is the biggest number"+c);

	}

}

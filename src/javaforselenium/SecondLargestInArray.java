package javaforselenium;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int a[]= {34,56,23,556,764};
		int size=a.length;
		Arrays.sort(a);
		int res=a[size-2];
		System.out.println(res);
		
	}

}

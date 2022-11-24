package infotech;

public class Array {

	 public static void main(String[] args) 
	{ 
		 int a=0;
		 int[] arr=new int[10];
	       for(int i=0; i<arr.length; i++)
	       {
	    	
	    	   arr[i]=isArray(10);
	           System.out.println(arr[i]);
	       }
	}
	 
	 public static int isArray(int n) {
		 int store=0;
		 for(int i=1; i<n; i++)
	       {
	    	   n=i*2-1;
	    	   store=n;
	    	   return store;
	       }
		return store;
		
	 }
}
	

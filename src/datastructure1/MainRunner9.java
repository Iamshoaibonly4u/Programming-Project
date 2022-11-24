//DAMTR search the number from the given Array.
package datastructure1;

public class MainRunner9 {
	static int search(int[] ar,int ele) {
		return search(ar,ele,ar.length-1);
	}

	 static int search(int[] ar, int ele, int index) {
		 if(index<0)
			 return -1;
		 if(ar[index]==ele)
			 return index;
		 return search(ar, ele,index-1);
	}

	public static void main(String[] args) {
		int ar[]= {34,56,78,54,32,12};
		int in=search(ar,78);
		if(in==-1)
			System.out.println("not present");
		else
			System.out.println("present at = "+in);
		
	}

}

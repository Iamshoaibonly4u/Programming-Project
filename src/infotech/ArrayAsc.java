package infotech;

import java.util.Arrays;

public class ArrayAsc {

	public static void main(String[] args) {

		int[] arr= {67,6,89,69,9,101,6,101,69,6};
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=count;
					count++;
					System.out.println(arr[i]+count);
				}
			}
	    }

    }
}

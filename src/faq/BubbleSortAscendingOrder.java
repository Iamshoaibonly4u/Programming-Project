package faq;

public class BubbleSortAscendingOrder {

	public static void getArrayValue(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {7,8,1,3,2};
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		getArrayValue(arr);
		
		
//		 int a[]={80,45,87,96,46,32};
//	       
//	       for(int i=0;i<a.length;i++){
//	           for(int j=i+1;j<a.length;j++){
//	               
//	               if(a[i]>a[j]){
//	                   int temp=a[i];
//	                   a[i]=a[j];
//	                   a[j]=temp;
//	                
//	               }
//	           }
//	       }
//	       for(int k=0;k<a.length;k++){
//	           System.out.print(a[k]+" ");
//	       }

	}

}

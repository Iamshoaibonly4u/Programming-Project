package tyss;


class demo {
	
	public static void main(String[] args) {
		int n=28;
		int sum=0;
		int i=1;
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
			System.out.println("perfect");
		else
			System.out.println("not perfect");
	}

}

class sum 
{
	public static void main(String[] args) 
	{
		int i=0;
		int sum=0;
		while (i<=100)
		{
			if(i%3==0 &&i%9==0)
			{
				sum=sum+i;
			}
		i++;
		}
		System.out.println("Addition is:"+sum);
	}
}

class numbers 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i=0;i<=100;i++)
		{
			if(i%3==0 && i%9==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Addition is:"+sum);
	}
}

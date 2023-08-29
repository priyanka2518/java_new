class sum 
{
	public static void main(String[] args) 
	{
		int i=0;
		int sum=0;
		do
		{
			if(i%3==0 && i%9==0)
			{
				System.out.println(i);
		        sum=sum+i;
            }
		i++;
		}
		while (i<=100);
		System.out.println("addition is:"+sum);
	}
}

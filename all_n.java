class all_n 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i=0;i<=200;i++)
		{
			if(i%5==0 && i%7==0)
			{
				count++;
			}
		}
		System.out.println("Count is:"+count);
	}
}

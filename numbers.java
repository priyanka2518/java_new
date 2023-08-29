class numbers
{
	public static void main(String[] args) 
	{
		int n=0;
		int count=0;
		do
		{
			if(n%5==0 && n%7==0)
			{
		      count++;
            }
		n++;
		}
		while (n<=200);
	    System.out.println(count);

	}
}

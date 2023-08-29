class vowels 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int count=0;
		do
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
		      count++;
            }
		ch++;
		}
		while (ch<='z');
	    System.out.println(count);

	}
}

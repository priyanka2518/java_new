//write a program to count the number of even numbers present inside an array
class count_even 
{
	public static void main(String[] args) 
	{
		int n[]={1,2,3,4,5,6,7,8,10,12,15};
		int count=0;
		for (int i=0;i<n.length;i++)
		{
			if(i%2==0)
			{
				count++;
			}	
		}
		System.out.println(count);
	}
}

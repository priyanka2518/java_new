//write a program to find addition of 5 numbers using array 
class ad
{
	public static void main(String[] args) 
	{
		int n[]={1,4,3,2,5};
		int sum=0;

		for (int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		System.out.println(sum);
	}
}

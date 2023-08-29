//design a method to print first 10 numbers in reverse order
class  reverse
{
	public static void rev(int a,int b)
	{
		for(int i=a;i>=b;i--)
		{
			System.out.println("Reverse number is:"+i);
		}
	}

	public static void main(String[] args) 
	{
		rev(10,1);
		rev(15,5);
	}
}

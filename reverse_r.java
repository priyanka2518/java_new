//design a method to print first 10 numbers in reverse order(return method)
class  reverse_r
{
	public static void rev(int a,int b)
	{
		for(int i=a;i>=b;i--)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
        System.out.println("Reverse number is:");
		rev(10,1);
		System.out.println("End of loop");
	}
}

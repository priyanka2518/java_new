//Design a method to check given number is positive or negative numbers
class  pos_neg
{
	public static void check(int a)
	{
		if (a>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
	}
	public static void main(String[] args) 
	{
		check(4);
		check(-5);
	}
}

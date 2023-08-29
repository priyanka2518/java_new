//design a method to check the number is even or odd(return type)
class even_odd_r 
{
	public static void num(int n)
	{
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("To check given number is even or odd:");
		num(3);
		num(6);
        System.out.println("End of loop");
	}
}

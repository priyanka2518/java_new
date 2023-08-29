//design a method to find largest of three numbers(return type)
class  largest_r
{
	public static void largest(int a,int b,int c)
	{
		System.out.println(a>b && a>c?a:b>c?b:c);
	}
	public static void main(String[] args) 
	{
		System.out.println("To find largest number");
		largest(4,2,7);
		largest(6,9,2);
		System.out.println("Thank you");
	}
}

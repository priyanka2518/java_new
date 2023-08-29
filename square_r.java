//design a method to calculate area of square(return type)
class square_r
{
	public static void sq(int side)
	{
		int area=side*side;
		System.out.println("Area of square is:"+area);
	}

	public static void main(String[] args) 
	{
		System.out.println("Calculate area of square");
		sq(4);
		System.out.println("Thank you");
	}
}

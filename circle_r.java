//design a method to calculate area of circle(return type)
class circle_r
{
	public static void circle(float r)
	{
		double area=2*3.14*r;
		System.out.println("Area of circle is:"+area);
	}

	public static void main(String[] args) 
	{
		System.out.println("Calculate area of circle");
		circle(3);
		System.out.println("Thank you");
	}
}

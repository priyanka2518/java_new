//design a method to print first 10 odd numbers
class  oddn
{
	public static void odd(int a,int b)
	{
		while(a<b)
		{
		  if(a%2!=0)
		  {
		    System.out.println(a);
		    
		  }
		 a++;
		}
	}
	public static void main(String[] args) 
	{
		odd(1,10);
		odd(20,30);
	}
}

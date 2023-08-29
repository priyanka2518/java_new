//design a method to print first 5 even numbers
class  evenn
{
	public static void even(int a,int b)
	{
		while(a<b)
		{
		  if(a%2==0)
		  {
		    System.out.println(a);
		    
		  }
		 a++;
		}
	}
	public static void main(String args[]) 
	{
		even(1,5);
		even(20,30);
	}
}

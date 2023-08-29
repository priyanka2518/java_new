//write a program to store first 10 numbers in reverse order and print the array
class reverse 
{
	public static void main(String[] args) 
	{
		int n[]=new int[10];
		int a=10;
		for (int index=0;index<n.length;index++)
		{
			n[index]=a--;
			System.out.println(n[index]);
		}
		
	}
}

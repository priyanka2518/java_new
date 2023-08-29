//write a program to store first 5 even numbers in array and print the array
class even
{
	public static void main(String[] args) 
	{
		int[] n=new int[5];
		int a=1;
		for (int index=0;index<n.length;a++)
		{
			if(a%2==0)
			{
			  n[index++]=a;
			  //System.out.println(n[index]);
			}
		}
		/*for (int index=0;index<n.length;a++)
		{
			
		}*/

	}
}

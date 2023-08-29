//write a program to store first 5 characters in an array and print the value
class character 
{
	public static void main(String[] args) 
	{
		char ch[]=new char[5];
		char c='a';
		for (int index=0;index<ch.length;index++)
		{
			ch[index]=c++;
			System.out.println(ch[index]);
		}
		//System.out.println("\");
		
	}
}

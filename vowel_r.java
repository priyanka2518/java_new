//design a method to check the character is vowel or not(return type)
class vowel_r 
{
	public static void vowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Not vowel");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("To check given character is vowel or not:");
		vowel('a');
		vowel('r');
        System.out.println("End of loop");
	}
}

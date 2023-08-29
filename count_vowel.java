//write a program to count the number of vowels present inside the array
class count_vowel 
{
	public static void main(String[] args) 
	{
		char ch[]={'p','r','i','a','n','k','a'};
		int count=0;
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

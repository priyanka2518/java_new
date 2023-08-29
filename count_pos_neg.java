//write a program to count the number of positive and negative number inside array
class count_pos_neg 
{
	public static void main(String[] args) 
	{
		int n[]={2,5,7,-8,-5,6,-4,1,-3};
		int pos=0;
		int neg=0;
		for (int i=0;i<n.length;i++)
		{
			if(n[i]>0)
			{
              pos++;
			}
			else
			{
				neg++;
			}
		}
		System.out.println("positive count is:"+pos);
		System.out.println("negative count is:"+neg);

	}
}

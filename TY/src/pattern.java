public class pattern 
{
	public static void main(String[] args)
	{
		pattern p =new pattern ();
		p.display();
	}
	void display()
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=2;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
}

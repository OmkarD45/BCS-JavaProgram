import java.util.Scanner;
public class arraysort 
{
	int a[],n,i;
	public static void main(String[] args)
	{
		arraysort as=new arraysort();
		as.get();
		as.sort();
	}
	
	void get()
	{
		System.out.println("Enter how many no you want to enter:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n]; 
		System.out.println("Enter the actual numbers:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	}
	
	void sort()
	{
		int temp,pass;
		for(pass=1;pass<n;pass++)
		{
			for(i=0;i<n-pass;i++)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}
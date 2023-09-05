import java.util.Scanner;

public class BubbleSort 
{
	int a[],n,i,j,pass;
	public static void main(String[] args) 
	{
		BubbleSort bs=new BubbleSort();
		bs.get();
		System.out.println("The sorted array elements are:");
		bs.sort();
	}
	void get()
	{
		System.out.println("Entert the no of elements:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the array elements:");
		a=new int[n];	
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
	}
	void sort()
	{
		int temp;
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
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}

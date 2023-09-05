import java.util.Scanner;

public class array 
{
	public int a[],n,i;
	public static void main(String[] args) 
	{
		array a=new array();
		a.accept();
		a.display();
	}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter the actual elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("The array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}

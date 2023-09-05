import java.util.Scanner;
public class Assign1A4 {
	public static void main(String[] args) {
		int a[],i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		n=s.nextInt();
		a=new int [n];
		System.out.println("Enter the nos");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Original Array is");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println("\n Reversed array ");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+"  ");
		}
	}

}

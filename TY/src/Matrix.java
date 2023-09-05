import java.io.*;
import java.util.Scanner;
public class Matrix 
{
	public static void main(String[] args)
	{
		matrixaccept m= new matrixaccept();
		m.acceptm();
		m.display();
	}
}
class matrixaccept
{
	public int i,j,a[][],m,n;
	void acceptm()
	{
		System.out.println("Enter the no of rows and columns respectively:");
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		a=new int[m][n];
		System.out.println("Enter the matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
	}
	void display()
	{
		System.out.println("Matrix is");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("   "+a[i][j]);
			}
			System.out.println("");
		}
	}
}

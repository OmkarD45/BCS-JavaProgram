package Company;

import java.util.Scanner;

public class Account 
{
	public double sal;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sal:");
		sal=s.nextDouble();
	}
}
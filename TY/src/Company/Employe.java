package Company;

import java.util.Scanner;

public class Employe
{
	public int id;
	public String name,dept;
	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id,name,dept of employee:");
		id=s.nextInt();
		name=s.next();
		dept=s.next();
	}
}


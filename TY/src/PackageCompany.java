import java.util.Scanner;

import Company.*;

public class PackageCompany 
{
	public static void main(String[] args) 
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of employees:");
		n=s.nextInt();
		Employe e[]=new Employe[n];
		Account ac[]=new Account[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Employe();
			ac[i]=new Account();
			e[i].accept();
			ac[i].accept();
		}
		System.out.println("Employee details are:");
		System.out.println("EmpID\tName\tDept\tSal");
		for(i=0;i<n;i++)
		{
			System.out.println(""+e[i].id+"\t"+e[i].name+"\t"+e[i].dept+"\t"+ac[i].sal);
		}
	}
}
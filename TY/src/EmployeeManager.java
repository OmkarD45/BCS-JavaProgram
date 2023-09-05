import java.util.Scanner;

class Employees
{
	public int id;
	public String name,dept;
	public double sal;
	public Employees(int id, String name, String dept, double sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
}

class Managers extends Employees
{
	double bonus,netsal;
	public Managers(int id, String name, String dept, double sal, double bonus) 
	{
		super(id, name, dept, sal);
		this.bonus=bonus;
	}
	void show()
	{
		netsal=sal+bonus;
		System.out.println(""+id+"\t"+name+"\t"+dept+"\t"+sal+"\t"+bonus+"\t"+netsal);
	}
}

public class EmployeeManager 
{
	public static void main(String[] args) 
	{
		int i,n,id;
		String name,dept;
		double sal,bonus;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total no of employees:");
		n=s.nextInt();
		Managers m[]=new Managers[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the employee id,name,dept,sal,bonus");
			id=s.nextInt();
			name=s.next();
			dept=s.next();
			sal=s.nextDouble();
			bonus=s.nextDouble();
			m[i]=new Managers(id,name,dept,sal,bonus);
		}
		System.out.println("Details of entered employees");
		System.out.println("Id\tName\tDept\tSal\tBonus\tNetsal");
		for(i=0;i<n;i++)
		{
			m[i].show();
		}
		double max=m[0].netsal;
		for(i=1;i<n;i++)
		{
			if(m[i].netsal>max)
			{
				max=m[i].netsal;
			}
		}
		System.out.println("The details of employee having maximum netsalary");
		System.out.println("Id\tName\tDept\tSal\tBonus\tNetsal");
		for(i=0;i<n;i++)
		{
			if(max==m[i].netsal)
				m[i].show();
		}
	}
}
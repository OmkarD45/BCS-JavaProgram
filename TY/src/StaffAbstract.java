import java.util.Scanner;

abstract class Staff
{
	String name,add;
	Staff(String name,String add)
	{
		this.name=name;
		this.add=add;
	}
	abstract void show();
}
class Fulltime extends Staff
{
	String dept;
	double sal;
	Fulltime(String name, String add, String dept, double sal) 
	{
		super(name, add);
		this.dept=dept;
		this.sal=sal;
	}
	void show()
	{
		System.out.println(""+name+"\t"+add+"\t"+dept+"\t"+sal);
	}
}

class Parttime extends Staff
{
	double noh,rph,amount;	
	Parttime(String name, String add, double noh, double rph) 
	{
		super(name, add);
		this.noh=noh;
		this.rph=rph;
	}
	void show()
	{
		amount=rph*noh;
		System.out.println(""+name+"\t"+add+"\t"+noh+"\t"+rph+"\t"+amount);
	}
}


public class StaffAbstract 
{
	public static void main(String[] args) 
	{
		int i,n;
		String name,add,dept,type;
		double sal,noh,rph;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the type of Staff (parttime/fulltime)");
		type=s.next();
		if(type.equalsIgnoreCase("fulltime"))
		{
			System.out.println("Enter the total no of fulltime staff");
			n=s.nextInt();
			Fulltime ft[]=new Fulltime[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the name and address");
				name=s.next();
				add=s.next();
				System.out.println("Enter the department and salary");
				dept=s.next();
				sal=s.nextDouble();
				ft[i]=new Fulltime(name,add,dept,sal);
			}
			System.out.println("Name\tAddress\tDepartment\tSalary");
			for(i=0;i<n;i++)
			{
				ft[i].show();
			}
		}
		else
		{
			System.out.println("Enter the total no of parttime staff");
			n=s.nextInt();
			Parttime ft[]=new Parttime[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the name and address");
				name=s.next();
				add=s.next();
				System.out.println("Enter the number of hours and rate per hour");
				noh=s.nextDouble();
				rph=s.nextDouble();
				ft[i]=new Parttime(name,add,noh,rph);
			}
			System.out.println("Name\tAddress\tNoH\tRpH\tAmount");
			for(i=0;i<n;i++)
			{
				ft[i].show();
			}
		}
	}
}
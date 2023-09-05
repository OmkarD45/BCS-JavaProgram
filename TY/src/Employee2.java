import java.util.Scanner;
public class Employee2 
{
	int id;
	String name,dept,desg;
	double sal;
	
	public Employee2(int id,String name,String dept,String desg,double sal) 
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.desg=desg;
		this.sal=sal;
	}

	public static void main(String[] args) 
	{
		int i,n;
		int idd;
		String nn,dpt,dsg;
		double s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no of employees to enter:");
		n=sc.nextInt();
		Employee2 e[]=new Employee2[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the employee "+(i+1)+" id, name, dept, desg, sal");
			idd=sc.nextInt();
			nn=sc.next();
			dpt=sc.next();
			dsg=sc.next();
			s=sc.nextDouble();
			e[i]=new Employee2(idd, nn, dpt, dsg, s);
		}
		System.out.println("Id\tName\tDept\tDesg\tSalary");
		for(i=0;i<n;i++)
		{
			e[i].display();
		}
	}

	private void display() 
	{
		System.out.println(""+id+"\t"+name+"\t"+dept+"\t"+desg+"\t"+sal);
	}
}
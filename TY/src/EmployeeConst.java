import java.util.Scanner;
public class EmployeeConst 
{
	int id;
	String name,dept,desg;
	double sal,bonus,total;
	public EmployeeConst(int id,String name,String dept,String desg,double sal,double bonus)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.desg=desg;
		this.sal=sal;
		this.bonus=bonus;
	}
	void cal()
	{
		total=bonus+sal;
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+dept+"\t"+desg+"\t"+sal+"\t"+bonus+"\t"+total);
	}
	public static void main(String[] args) 
	{

		int id;
		String name,dept,desg;
		double sal,bonus;
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of employees:");
		n=s.nextInt();
		EmployeeConst emp[]=new EmployeeConst[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the id, name, dept, desgnation and salary");
			id=s.nextInt();
			name=s.next();
			dept=s.next();
			desg=s.next();
			sal=s.nextDouble();
			System.out.println("Enter the bonus");
			bonus=s.nextDouble();
			emp[i]=new EmployeeConst(id, name, dept, desg, sal, bonus);
		}
		System.out.println("Id\tName\tdepartment\tdesg\tsal\tbonus\tTotal");
		for(i=0;i<n;i++)
		{
			emp[i].cal();
			emp[i].display();
		}
	}
}

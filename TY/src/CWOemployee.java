import java.util.Scanner;

public class CWOemployee 
{
	int id;
	String name,dept,desg;
	double sal,bonus,total;
	void getdetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the id, name, dept, desgnation and salary");
		id=s.nextInt();
		name=s.next();
		dept=s.next();
		desg=s.next();
		sal=s.nextDouble();
		System.out.println("Enter the bonus");
		bonus=s.nextDouble();
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
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of employees:");
		n=s.nextInt();
		CWOemployee emp[]=new CWOemployee[n];
		for(i=0;i<n;i++)
		{
			emp[i]=new CWOemployee();
			emp[i].getdetails();
			emp[i].cal();
		}
		System.out.println("Id\tName\tdepartment\tdesg\tsal\tbonus\tTotal");
		for(i=0;i<n;i++)
		{
			emp[i].display();
		}
	}

}

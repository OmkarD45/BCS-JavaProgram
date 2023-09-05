import java.util.Scanner;
abstract class Staff1{
	String name,add;
	abstract void accept();
	abstract void display();
}
class FullT extends Staff1{
	String dept;
	double sal;
	@Override
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name, address, department and salary");
		name=s.next();
		add=s.next();
		dept=s.next();
		sal=s.nextDouble();
	}
	@Override
	void display() {
		System.out.println(name+"\t"+add+"\t"+dept+"\t"+sal);
	}	
}
class PartT extends Staff1{
	double noh,rph,sal;
	@Override
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name, add noh and rph");
		name=s.next();
		add=s.next();
		noh=s.nextDouble();
		rph=s.nextDouble();
		sal=noh*rph;
	}
	@Override
	void display() {
		System.out.println(name+"\t"+add+"\t"+noh+"\t\t"+rph+"\t\t"+sal);
	}	
}
public class AbstractStaff {
	public static void main(String[] args) {
		int i,n;
		String type;
		System.out.println("Enter staff (PartTime/FullTime)");
		Scanner s=new Scanner(System.in);
		type=s.next();
		if(type.equalsIgnoreCase("PartTime"))
		{
			System.out.println("Enter the no of parttime staff");
			n=s.nextInt();
			PartT pt[]=new PartT[n];
			for(i=0;i<n;i++)
			{
				pt[i]=new PartT();
				pt[i].accept();
			}
			System.out.println("Name\tAddress\tNo of Hours\tRate per Hour\tSalary");
			for(i=0;i<n;i++)
			{	
				pt[i].display();
			}
		}
		else
		{
			System.out.println("Enter the no of fullTime staff");
			n=s.nextInt();
			FullT ft[]=new FullT[n];
			for(i=0;i<n;i++)
			{
				ft[i]=new FullT();
				ft[i].accept();
			}
			System.out.println("Name\tAddress\tDepartment\tSalary");
			for(i=0;i<n;i++)
			{
				ft[i].display();				
			}
		}
	}
}

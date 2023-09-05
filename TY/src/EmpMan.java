import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {

	public int id,n;
	String name;
	public String dept;
	public double sal;
	public Employee(int id, String name, String dept, double sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
}

class Manager extends Employee{
	public double bonus,total;
	public Manager(int id, String name, String dept, double sal, double bonus)
	{
		super(id,name,dept,sal);
		this.bonus=bonus;
	}
	public void show()
	{
		total=bonus+sal;
		System.out.println(""+id+"\t"+name+"\t"+dept+"\t"+sal+"\t"+bonus+"\t"+total);
	}
}


public class EmpMan {

	public static void main(String[] args)throws IOException
	{
		int n,i,id;
		String name;
		String dept;
		double sal;
		double bonus;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of employees:");
		n=Integer.parseInt(br.readLine());
		Manager[] m=new Manager[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the employee details (id,name,dept,sal,bonus)");
			id=Integer.parseInt(br.readLine());
			name=br.readLine();
			dept=br.readLine();
			sal=Double.parseDouble(br.readLine());
			bonus=Double.parseDouble(br.readLine());
			m[i]=new Manager(id,name,dept,sal,bonus);
		}
		System.out.println("id\tname\tdept\tsal\tbonus\ttotal");
		for(i=0;i<n;i++)
			m[i].show();
	}
}

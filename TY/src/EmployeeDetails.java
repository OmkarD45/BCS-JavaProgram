import java.io.*;
class EmployeeDetails 
{
	int eid;
	String empname,desg,dept;
	double sal;
	public static void main(String[] args) throws IOException
	{
		int n,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of employees:");
		n=Integer.parseInt(br.readLine());
		EmployeeDetails e[]=new EmployeeDetails[n];
		for(i=0;i<n;i++)
		{
			e[i]=new EmployeeDetails();
		}
		for(i=0;i<n;i++) 
		{
			System.out.println("Enter the emp "+(i+1)+" id,name,desg,dept,sal");
			e[i].acceptdetails();
		}
		System.out.println("Empid   Empname \t  desg  \tdept\t\tsal");
		for(i=0;i<n;i++)
		{
			e[i].displaydetails();
		}
	}
	void acceptdetails() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		eid=Integer.parseInt(br.readLine());
		empname=br.readLine();
		desg=br.readLine();
		dept=br.readLine();
		sal=Double.parseDouble(br.readLine());
	}
	void displaydetails()
	{
		System.out.println(""+eid+"\t"+empname+"\t"+desg+"\t"+dept+"\t"+sal);
	}
}

import java.util.Scanner;
class Emp{
	int id;
	String name,dept;
	double sal,bonus;
	void accept() {
		System.out.println("Enter the employee id, name, department and salary");
		Scanner s=new Scanner(System.in);
		id=s.nextInt();
		name=s.next();
		dept=s.next();
		sal=s.nextDouble();
	}
}
public class InheritanceEmp extends Emp{
	double netsal,bonus;
	void bonus(){
		System.out.println("Enter the bonus");
		Scanner s=new Scanner(System.in);
		bonus=s.nextDouble();
	}
	void show() {
		netsal=bonus+sal;
		System.out.println(id+"\t"+name+"\t"+dept+"\t"+sal+"\t"+bonus+"\t"+netsal);
	}
	public static void main(String[] args) {
		System.out.println("Enter the no of employees");
		Scanner s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		InheritanceEmp a[]=new InheritanceEmp[n];
		for(i=0;i<n;i++)
		{
			a[i]=new InheritanceEmp();
			a[i].accept();
			a[i].bonus();
		}System.out.println("Id\tName\tdept\tsal\tbonus\tnetsal");
		for(i=0;i<n;i++)
		{
			a[i].show();
		}
	}

}

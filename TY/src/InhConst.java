import java.util.Scanner;
class EmpConst{
	int id;
	String name,dept;
	double sal,bonus,netsal;
	EmpConst(int id,String name, String dept,double sal){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
}
public class InhConst extends EmpConst{
	public InhConst(int id,String name, String dept,double sal,double bonus) {
		super(id,name,dept,sal);
		this.bonus=bonus;
	}
	void display() {
		netsal=sal+bonus;
		System.out.println(id+"\t"+name+"\t"+dept+"\t"+sal+"\t"+bonus+"\t"+netsal);
	}
	public static void main(String[] args) {
		int n,i;
		int id;
		String name,dept;
		double sal,bonus,netsal;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of employees");
		n=s.nextInt();
		InhConst a[]=new InhConst[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the id, name, dept, sal and bonus");
			id=s.nextInt();
			name=s.next();
			dept=s.next();
			sal=s.nextDouble();
			bonus=s.nextDouble();
			a[i]=new InhConst(id, name, dept, sal, bonus);
		}System.out.println("Id\tName\tdept\tsal\tbonus\tnetsal");
		for(i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}

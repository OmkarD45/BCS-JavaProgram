import java.util.Scanner;
abstract class Staff2{
	String name,add;
	Staff2(String name,String add){
		this.name=name;
		this.add=add;
	}
	abstract void display();
}
class ftime extends Staff2{
	String dept;
	double sal;
	ftime(String name, String add,String dept, double sal) {
		super(name, add);
		this.dept=dept;
		this.sal=sal;
	}
	@Override
	void display() {
		System.out.println(name+"\t"+add+"\t"+dept+"\t"+sal);
	}
}
class ptime extends Staff2{
	int noh;  double rph,t;
	ptime(String name, String add,int noh, double rph) {
		super(name, add);
		this.noh=noh;
		this.rph=rph;
	}
	@Override
	void display() {
		t=rph*noh;
		System.out.println(name+"\t"+add+"\t"+noh+"\t"+rph+"\t"+t);
	}
}
public class MainStaff {
	public static void main(String[] args) {
		int n,i,noh;
		String type,dept,name,add;
		double sal,rph;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Staff Type(parttime/fulltime)");
		type=s.next();
		if(type.equalsIgnoreCase("fulltime"))
		{
			System.out.println("Enter the no of fulltime staff");
			n=s.nextInt();
			ftime ft[]=new ftime[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the name,address,department & salary");
				name=s.next();		add=s.next();
				dept=s.next();  	sal=s.nextDouble();
				ft[i]=new ftime(name, add, dept, sal);
			}
			for(i=0;i<n;i++)
			{
				ft[i].display();
			}
		}
		else
		{
			System.out.println("Enter the no of parttime staff");
			n=s.nextInt();
			ptime pt[]=new ptime[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the name,address,noh & rph");
				name=s.next();		 add=s.next();
				noh=s.nextInt();	 rph=s.nextDouble(); 
				pt[i]=new ptime(name,add,noh,rph);
			}
			for(i=0;i<n;i++)
			{
				pt[i].display();
			}
		}
	}

}

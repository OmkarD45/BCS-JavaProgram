import java.util.Scanner;
import java.util.StringJoiner;

public class vehicle 
{
	int vno;
	String cmp,name,type;
	double mil;
	public vehicle(int vno,String cmp,String name,String type,double mil) 
	{
		this.vno=vno;
		this.cmp=cmp;
		this.name=name;
		this.type=type;
		this.mil=mil;
	}
	void display()
	{
		System.out.println(""+vno+"\t"+cmp+"\t"+name+"\t"+type+"\t"+mil);
	}
	public static void main(String[] args) 
	{
		int vno,i,n;
		String cmp,name,type;
		double mil,max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of vehical");
		n=s.nextInt();
		vehicle v[]=new vehicle[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the vehical no,company,name,type and mileage:");
			vno=s.nextInt();
			cmp=s.next();
			name=s.next();
			type=s.next();
			mil=s.nextDouble();
			v[i]=new vehicle(vno, cmp, name, type, mil);
		}
		System.out.println("Vno\tcompany\tname\ttype\tmil");
		for(i=0;i<n;i++)
		{
			v[i].display();
		}
		max=v[0].mil;
		System.out.println("Highest mileage Vehical");
		for(i=1;i<n;i++)
		{
			if(v[i].mil>max)
			{
				max=v[i].mil;
			}
		}
		System.out.println("Vno\tcompany\tname\ttype\tmil");
		for(i=0;i<n;i++)
		{
			if(v[i].mil==max)
			{
				v[i].display();
			}
		}
	}

}

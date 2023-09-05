import java.util.Scanner;

public class ConstVehicle 
{
	public String vno,cname,vname,type;
	public double mil;
	public ConstVehicle(String vno,String cname,String vname,String type,double mil) 
	{
		this.vno=vno;
		this.cname=cname;
		this.vname=vname;
		this.type=type;
		this.mil=mil;
	}
	void display()
	{
		System.out.println(vno+"\t"+cname+"\t"+vname+"\t"+type+"\t"+mil);
	}

	public static void main(String[] args)
	{
		int n,i;
		String vno,cname,vname,type;
		double mil,max;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of vehicles:");
		n=s.nextInt();
		ConstVehicle v[]=new ConstVehicle[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the vehicle "+(i+1)+" Vno,Cname,Vname,Type,Mil");
			vno=s.next();
			cname=s.next();
			vname=s.next();
			type=s.next();
			mil=s.nextDouble();
			v[i]=new ConstVehicle(vno, cname, vname, type, mil);
		}
		System.out.println("VNo\tCname\tVName\tType\tMil");
		for(i=0;i<n;i++)
		{
			v[i].display();
		}
		max=v[0].mil;
		for(i=1;i<n;i++)
		{
			if(v[i].mil>max)
			{
				max=v[i].mil;
			}
		}
		System.out.println("The highest mileage vehicle is:");
		System.out.println("VNo\tCname\tVName\tType\tMil");
		for(i=0;i<n;i++)
		{
			if(v[i].mil==max)
			{
				v[i].display();
			}	
		}
	}

}

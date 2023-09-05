import java.util.Scanner;

class Vehical {
	public String cname;
	public double price;
	public Vehical(String cname, double price)
	{
		this.cname=cname;
		this.price=price;
	}
}


class LMV extends Vehical 
{
	public double mil;
	public LMV(String cname, double price, double mil)
	{
		super(cname,price);
		this.mil=mil;
	}
	void show()
	{
		System.out.println(""+cname+"\t"+price+"\t"+mil);
	}
}

class HMV extends Vehical {
	public double cap;
	public HMV(String cname, double price, double cap)
	{
		super(cname,price);
		this.cap=cap;
	}
	void show()
	{
		System.out.println(""+cname+"\t"+price+"\t"+cap);
	}
}

public class Mainvehical {
	public static void main(String[] args)
	{
		int n,i;
		String cname,vtype;
		double price,mil,cap;
		Scanner s=new Scanner(System.in);
		System.out.println("Choose Vehical type (lmv or hmv)");
		vtype=s.next();
		if(vtype.equals("lmv")||vtype.equals("LMV"))		
		{
			System.out.println("Enter the no of Light Weight Vehicles");
			n=s.nextInt();
			LMV l[]=new LMV[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the company name and price");
				cname=s.next();
				price=s.nextDouble();
				System.out.println("Enter the mileage");
				mil=s.nextDouble();
				l[i]=new LMV(cname,price,mil);
			}
			System.out.println("Company\tPrice\tMileage");
			for(i=0;i<n;i++)
			{
				l[i].show();
			}
		}
		else
		{
			System.out.println("Enter the no of Heavy Weight Vehicles");
			n=s.nextInt();
			HMV l[]=new HMV[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the company name and price");
				cname=s.next();
				price=s.nextDouble();
				System.out.println("Enter the Capacity in tons");
				cap=s.nextDouble();
				l[i]=new HMV(cname,price,cap);
			}
			System.out.println("Company\tPrice\tCapacity");
			for(i=0;i<n;i++)
			{
				l[i].show();
			}
		}
	}
}














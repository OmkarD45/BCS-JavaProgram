import java.util.Scanner;

abstract class Shape
{
	abstract void area();
	abstract void vol();
}

class sphere extends Shape
{
	public double r,area,volume;
	void area()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=s.nextDouble();
		area=4*3.14*r*r;
		System.out.println("Area of Sphere is:"+area);
	}

	void vol() 
	{
		volume=4/3*3.14*r*r*r;
		System.out.println("Volume of Sphere is:"+volume);
	}	
}

class cone extends Shape
{
	public double r,area,volume,sh,h;
	void area() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius and slant height:");
		r=s.nextDouble();
		sh=s.nextDouble();
		area=3.14*r*(r+sh);
		System.out.println("Area of cone is:"+area);
	}

	void vol() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height of cone");
		h=s.nextDouble();
		volume=(3.14*r*r*h)/3;
		System.out.println("Volume of cone is:"+volume);
	}	
}
 class cylinder extends Shape
 {
	 public double r,h,area,volume; 
	void area() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius and height:");
		r=s.nextDouble();
		h=s.nextDouble();
		area=2*3.14*r*(r+h);
		System.out.println("Area of cylinder is:"+area);
	}

	void vol() 
	{
		volume=3.14*r*r*h;
		System.out.println("Volume of cylinder is:"+volume);
	} 
 }
 class squarebox extends Shape
 {
	 public double h,w,l,area,volume;
	void area() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height, width and length of squarebox:");
		h=s.nextDouble();
		w=s.nextDouble();
		l=s.nextDouble();
		area=2*h*w+2*w*l+2*l*h;
		System.out.println("Area of squarebox is:"+area);
	}

	void vol() 
	{
		volume=l*w*h;
		System.out.println("Volume of squarebox is:"+volume);
	}
	 
 }

public class AbstractShape 
{
	public static void main(String[] args) 
	{
		sphere sp=new sphere();
		cone cn=new cone();
		cylinder cy=new cylinder();
		squarebox sb=new squarebox();
		int ch;
		do
		{
			System.out.println("1.Sphere\t2.Cone\t3.Cylinder\t4.SquareBox\t5.Exit\nEnter your choice");
			Scanner s=new Scanner(System.in);
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
			{
				sp.area();
				sp.vol();
				break;
			}
			case 2:
			{
				cn.area();
				cn.vol();
				break;
			}
			case 3:
			{
				cy.area();
				cy.vol();
				break;
			}
			case 4:
			{
				sb.area();
				sb.vol();
				break;
			}
			}
		}while(ch!=5);
	}
}

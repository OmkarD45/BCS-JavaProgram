import java.util.Date;
import java.util.Scanner;
class getD
{
	public int dd,mm,yy,dd2,mm2,yy2,flag,days,months,years,c;
	public void current()
	{
		Date d=new Date();
		dd=(d.getDate()); 
		mm=(d.getMonth()+1);
		yy=(d.getYear()+1900);
		System.out.print("Current Date is: ");
		System.out.print(dd+"/");
		System.out.print(mm+"/");
		System.out.println(yy);	
	}
	void accept() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter date/month/year respectively");
		dd2=s.nextInt();
		mm2=s.nextInt();
		yy2=s.nextInt();
		if(yy2>=1000 && yy2<=2500)
		{
			if(mm2>0 && mm2<=12)
			{
				if(mm2==1 || mm2==3 || mm2==5 || mm2==7 || mm2==8 || mm2==10 || mm2==12)
				{
					if(dd2>0 && dd2<=31)
						flag = 0;
					
				}
				else if(mm2==4 || mm2==6 || mm2==9 || mm2==11)
				{
					if(dd2>0 && dd2<=30)
						flag = 0;
					else 
						flag= 1;
				}
				else
				{
					if((yy2)%4==0)
					{
						if(dd2>0 && dd2<=29)
							flag= 0;
						else
							flag= 1;
					}
					else
					{
						if(dd2>0 && dd2<=28)
							flag= 0;
						else
							flag= 1;
					}
				}
			}
			else
			{
				flag= 1;
			}
		}
		else
		{
			flag= 1;
		}
	}
	void display()
	{
		if(flag==0)
		{
			System.out.println("your entered date is: ");
			System.out.print(dd2+"/");
			System.out.print(mm2+"/");
			System.out.println(yy2);
		}
		else
		{
			
			System.out.println("Date is invalid");
		}
	}
	void cal()
	{
		if(yy2%4==0)
		{
			if(mm2==2)
			{
				if(dd2>0 && dd2<=29)
				{
					dd2++;
					c++;
				}	
				mm2++;
			}
			else if(mm2==1 || mm2==3 || mm2==5 || mm2==7 || mm2==8 || mm2==10 || mm2==12)
			{
				if(dd2>0 && dd2<=31)
					{
						dd2++;
						c++;
					}
				mm2++;
			}
			else if(mm2==4 || mm2==6 || mm2==9 || mm2==11)
			{
				if(dd2>0 && dd2<=30)
				{
					dd2++;
					c++;
				}
				mm2++;
			}
			yy2++;
		}
	}
}


public class DateCalculator 
{
	public static void main(String[] args) 
	{
		getD gd=new getD();
		gd.current();
		gd.accept();
		gd.display();
		gd.cal();
	}
}

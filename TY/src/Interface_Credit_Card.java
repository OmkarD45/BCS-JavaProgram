import java.util.Scanner;
interface CreditCard
{
	void ViewCard();
	void UseCard();
	void PayCard();
}
class SilverCard implements CreditCard
{
	public String name, acno;
	public double bal;
	Scanner s;
	void getInfo()
	{
		s=new Scanner(System.in);
		System.out.println("Enter account holder name, account no and opening balance");
		name=s.next();
		acno=s.next();
		bal=s.nextDouble();
	}
	@Override
	public void ViewCard() 
	{
		System.out.println("Name:"+name);
		System.out.println("Account no:"+acno);
		System.out.println("Balance:"+bal);
	}
	@Override
	public void UseCard() 
	{
		double amt;
		System.out.println("Enter the WITHDRAW Amount:");
		amt=s.nextDouble();
		if(amt>bal)
			System.out.println("Insufficient Balance");
		else
			bal=bal-amt;
	}
	@Override
	public void PayCard() 
	{
		double amt = 0;
		System.out.println("Enter the CREDIT Amount:");
		amt=s.nextDouble();
		bal=bal+amt;
	}
}
public class Interface_Credit_Card 
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner s=new Scanner(System.in);
		SilverCard sc=new SilverCard();
		do 
		{
			System.out.println("1.Get Details\n2.View Card\n3.Use Card\n4.Pay Card\nEnter Your Choice");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:sc.getInfo();
					break;
			case 2:sc.ViewCard();
					break;
			case 3:sc.UseCard();
					break;
			case 4:sc.PayCard();
					break;
			}
		}while(ch!=5);
	}

}
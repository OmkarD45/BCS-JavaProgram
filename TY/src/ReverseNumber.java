import java.util.Scanner;

public class ReverseNumber 
{
	int n,p,r;
	public static void main(String[] args) 
	{
		ReverseNumber r=new ReverseNumber();
		System.out.println("Enter the number ");
		r.accept();
		r.reverse();
	}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	}
	void reverse()
	{
		while(n>0)
		{
			r=n%10;
			p=p*10+r;
			n=n/10;
		}
		System.out.println("The reverse of the number is :"+p);
	}
}

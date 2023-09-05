import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticException {

	public static void main(String[] args) 
	{
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Enter two nos");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=a/b;
			System.out.println("Answer is "+c);
		}
		catch(Exception ee)
		{
			System.out.println(""+ee);
		}
	}
}

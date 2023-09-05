import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		int l = 0,k,m,n,rev=0,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		j=n;
		j=j/10;
		while(j>0)
		{
			k=j%10;
			l=l*10+k;
			j=j/10;
		}
		System.out.println("output : "+l);
		
	}
}

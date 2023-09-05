import java.util.Scanner;
public class Assign1A3 {
	public static void main(String[] args) {
		int ch,q=0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("1.Vol of Cylinder\t2.Fact of no.\n3.Armstrong no. or not\t4.Exit");
			System.out.println("Enter your choice");
			ch=s.nextInt();
			switch (ch) {
			case 1: {
				int r,h;
				double vol;
				System.out.println("Enter the radius and height resp");
				r=s.nextInt();
				h=s.nextInt();
				vol=3.14*r*r*h;
				System.out.println("Volume of cylinder is "+vol);
			}break;
			case 2:{
				int n,i,fact=1;
				System.out.println("Enter the no");
				n=s.nextInt();
				for(i=n;i>0;i--)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of a no is "+fact);
			}break;
			case 3:{
				int m,t=0,n,k,sum=0;
				System.out.println("Enter the no");
				n=s.nextInt();
				m=n;
				k=n;
				while(m>0)
				{
					t=t+1;
					m=m/10;
				}
				while(k>0){	
					m=k%10;
					int z=Assign1A3.pow(t,m);
					sum=sum+z;
					k=k/10;
				}
				if(n==sum)
				{
					System.out.println("Given no is Armstrong");
				}
				else 
				{
					System.out.println("Given no is NOT Armstrong");
				}
			}break;
			case 4:{
				q=1;
			}
			}
		}while(q==0);
		
	}
	static int pow(int i,int n)
	{
		int pow=1;
		for (int j=0;j<i;j++)
		{
			pow=pow*n;
		}
		return pow;
	}

}

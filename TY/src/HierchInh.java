import java.util.Scanner;
class VehicalH{
	String cmp;
	double price;
	void acceptV(){
		Scanner s=new Scanner(System.in);
		cmp=s.next();
		price=s.nextDouble();
	}
}
class LWV extends VehicalH{
	float mil;
	void acceptL() {
		Scanner s=new Scanner(System.in);
		mil=s.nextFloat();
	}
	void displayL() {
		System.out.println(cmp+"\t"+price+"\t"+mil);
	}
}
class HWV extends VehicalH{
	double cap;
	void acceptH(){
		Scanner s=new Scanner(System.in);
		cap=s.nextDouble();
	}
	void displayH() {
		System.out.println(cmp+"\t"+price+"\t"+cap);
	}
}
public class HierchInh {
	public static void main(String[] args) {
		int i,n,ch;
		Scanner s=new Scanner(System.in);
		System.out.println("1.LWV \n 2.HWV \t Enter your choice");
		ch=s.nextInt();
		switch (ch) {
			case 1: {
				System.out.println("Enter no of Light Weight Vehicals");
				n=s.nextInt();
				LWV l[]=new LWV[n];
				for(i=0;i<n;i++)
				{
					l[i]=new LWV();
					System.out.println("Enter company and price");
					l[i].acceptV();
					System.out.println("Enter vehical milage");
					l[i].acceptL();
				}
				System.out.println("Company\tPrice\tAverage");
				for(i=0;i<n;i++)
				{
					l[i].displayL();
				}
			}
			case 2:{
				System.out.println("Enter no of Heavy Weight Vehicals");
				n=s.nextInt();
				HWV h[]=new HWV[n];
				for(i=0;i<n;i++)
				{
					h[i]=new HWV();
					System.out.println("Enter company and price");
					h[i].acceptV();
					System.out.println("Enter vehical cap");
					h[i].acceptH();
				}	
				System.out.println("Company\tPrice\tCapacity(in tons)");
				for(i=0;i<n;i++)
				{
					h[i].displayH();
				}	
			}
		}
	}
}
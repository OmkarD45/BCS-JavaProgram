import java.util.Scanner;
class StudentM{
	int roll;
	String n;
	StudentM(int roll,String name) {
		this.roll=roll;
		n=name;
	}
}
class MarksM extends StudentM{
	double m1,m2,m3;
	MarksM(int roll, String name,double m1,double m2,double m3) {
		super(roll, name);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}	
}
class ResultM extends MarksM{
	double total,per;
	String grade;
	ResultM(int roll, String name, double m1, double m2, double m3) {
		super(roll, name, m1, m2, m3);
	}
	void display() {
		total=m1+m2+m3;
		per=total/3;
		String grade;
		if(per>90)
		{
			grade="A";
		}
		else if(per>70 && per<=90)
		{
			grade="B";
		}
		else if(per>50 && per<=70)
		{
			grade="C";
		}
		else if(per>=35 && per<=50)
		{
			grade="PASS";
		}
		else
		{
			grade="FAIL";
		}
		System.out.println(roll+"\t"+n+"\t"+total+"\t"+per+"%\t"+grade);
	}
}
public class MultiInhConst {
	public static void main(String[] args) {
		int n,i,roll;
		double m1,m2,m3;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Students:");
		n=s.nextInt();
		ResultM r[]=new ResultM[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the roll no, name and 3 sub marks");
			roll=s.nextInt();
			name=s.next();
			m1=s.nextDouble();
			m2=s.nextDouble();
			m3=s.nextDouble();
			r[i]=new ResultM(roll, name, m1, m2, m3);
		}
		System.out.println("Roll\tName\tTotal\tPercent\tGrade");
		for(i=0;i<n;i++)
		{
			r[i].display();
		}
	}
}

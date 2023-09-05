import java.util.Scanner;
class Student2{
	int roll;
	String name;
	void acceptS() {
		Scanner s=new Scanner(System.in);
		roll=s.nextInt();
		name=s.next();
	}
}
class Marks1 extends Student2{
	double m1,m2,m3;
	void acceptM() {
		Scanner s=new Scanner(System.in);
		m1=s.nextDouble();
		m2=s.nextDouble();
		m3=s.nextDouble();
	}
}
class Result1 extends Marks1{
	double total,per;
	String grade;
	void display() {
		total=m1+m2+m3;
		per=total/3;
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
		System.out.println(roll+"\t"+name+"\t"+total+"\t"+per+"%\t"+grade);
	}
}
public class MultiInh {
	public static void main(String[] args) {
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Students:");
		n=s.nextInt();
		Result1 r[]=new Result1[n];
		for(i=0;i<n;i++)
		{
			r[i]=new Result1();
			System.out.println("Enter roll no and name");
			r[i].acceptS();
			System.out.println("Enter the marks of 3 subjects");
			r[i].acceptM();
		}
		System.out.println("Roll\tName\tTotal\tPercent\tGrade");
		for(i=0;i<n;i++)
		{
			r[i].display();
		}
	}
}

import java.util.Scanner;
public class Student1 
{
	int roll;
	String name,grade;
	double s1,s2,s3,total,percent;
	public static void main(String[] args) 
	{
		int n,i;
		System.out.println("Enter the no of Students:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Student1 st[]=new Student1[n];
		for(i=0;i<n;i++)
		{
			st[i]=new Student1();
			st[i].accept();
			st[i].cal();
		}
		System.out.println("Roll\tName  \ttotal\tpercent\tgrade");
		for(i=0;i<n;i++)
		{
			st[i].display();
		}
	}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the roll no and name:");
		roll=s.nextInt();
		name=s.next();
		System.out.println("Enter the 3 Sub marks");
		s1=s.nextDouble();
		s2=s.nextDouble();
		s3=s.nextDouble();
	}
	void cal()
	{
		total=s1+s2+s3;
		percent=total/3;
		if(percent>90)
		{
			grade="A";
		}
		else if(percent>=70 && percent<90)
		{
			grade="B";
		}
		else if(percent>=60 && percent<70)
		{
			grade="C";
		}
		else if(percent>=45 && percent<60)
		{
			grade="D";
		}
		else if(percent>=35 && percent<45)
		{
			grade="PASS";
		}
		else if(percent<35)
		{
			grade="FAIL";
		}
	}
	void display()
	{
		System.out.println(""+roll+"\t"+name+"\t"+total+"\t"+percent+"\t"+grade);
	}	
}

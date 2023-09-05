import java.util.Scanner;
public class StudentConstructor 
{
	int roll;
	String name,grade;
	double s1,s2,s3,total,percent;
	public StudentConstructor(int roll,String name,double s1,double s2,double s3) 
	{
		this.roll=roll;
		this.name=name;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
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
	
	
	public static void main(String[] args) 
	{
		int n,i;
		int roll;
		String name,grade;
		double s1,s2,s3,total,percent;
		System.out.println("Enter the no of Students:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		StudentConstructor st[]=new StudentConstructor[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Student "+(i+1)+" roll no and name");
			roll=s.nextInt();
			name=s.next();
			System.out.println("Enter three sub marks");
			s1=s.nextDouble();
			s2=s.nextDouble();
			s3=s.nextDouble();
			st[i]=new StudentConstructor(roll, name, s1, s2, s3);
			st[i].cal();
		}
		System.out.println("Roll\tName  \ttotal\tpercent\tgrade");
		for(i=0;i<n;i++)
		{
			st[i].display();
		}
	}

}

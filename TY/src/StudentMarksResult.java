import java.util.Scanner;

class Student 
{
	public int roll;
	public String name;
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
}

class Marks extends Student 
{
	public int m1,m2,m3;
	public Marks(int roll, String name, int s1,int s2,int s3) 
	{
		super(roll,name);
		m1=s1;
		m2=s2;
		m3=s3;
	}
}

class Result extends Marks {
	public int total;
	public float per;
	public char grade;
	public Result(int roll, String name, int s1,int s2,int s3) 
	{
		super(roll,name,s1,s2,s3);
	}
	void calculate()
	{
		total=m1+m2+m3;
		per=total/3;
		if(per>=70)
			grade='O';
		else if(per>=60 && per<70)
			grade='A';
		else if(per>=50 && per<60)
			grade='B';
		else if(per>=40 && per<50)
			grade='C';
		else
			grade='F';
	}
	
	void show()
	{
		System.out.println(""+roll+"\t"+name+"\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+per+"\t"+grade);
	}

}
public class StudentMarksResult {

	public static void main(String[] args) 
	{
		int n,i,roll,m1,m2,m3;
		String name;
		Scanner T=new Scanner(System.in);
		System.out.println("Enter the total no of Students");
		n=T.nextInt();
		Result r[]=new Result[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the roll no and name");
			roll=T.nextInt();
			name=T.next();
			System.out.println("Enter the 3 sub marks");
			m1=T.nextInt();
			m2=T.nextInt();
			m3=T.nextInt();
			
			r[i]=new Result(roll,name,m1,m2,m3);
			r[i].calculate();
		}
		System.out.println("Roll no\tName\tSub1\tSub2\tSub3\tTotal\tPer\tGrade");
		for(i=0;i<n;i++)
		{
			r[i].show();
		}
	}

}

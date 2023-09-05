import java.util.Scanner;

public class StudentResult 
{
	public int roll,sub1,sub2,sub3,total;
	String name;
	float percent;
	public static void main(String[] args) 
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Students");
		n=s.nextInt();
		StudentResult sr[]=new StudentResult[n];
		for(i=0;i<n;i++)
		{
			sr[i]=new StudentResult();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Student "+(i+1)+" roll, name & 3 sub marks");
			sr[i].accept();
			sr[i].Cal();
		}System.out.println("roll\tname\tsub1\tsub2\tsub3\ttotal\tpercent");
		for(i=0;i<n;i++)
		{
			sr[i].display();
		}
	}
	void accept()
	{
		Scanner s=new Scanner(System.in);
		roll=s.nextInt();
		name=s.next();
		sub1=s.nextInt();
		sub2=s.nextInt();
		sub3=s.nextInt();
	}
	void Cal()
	{
		total=sub1+sub2+sub3;
		percent=total/3;
	}
	void display()
	{
		System.out.println(""+roll+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+total+"\t"+percent);
	}
}

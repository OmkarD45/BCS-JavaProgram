import java.util.Scanner;

import Sy.*;
import Ty.*;

public class StudentMarks 
{
	public int roll;
	public String name; 
	public void accept()
	{
		System.out.println("Enter the Roll no and name");
		Scanner s=new Scanner(System.in);
		roll=s.nextInt();
		name=s.next();
	}
	public static void main(String[] args) 
	{
		int n,i;
		float total,per;
		char grade;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many Students");
		n=s.nextInt();
		StudentMarks SM[]=new StudentMarks[n];
		SyMarks Sy[]=new SyMarks[n];
		TyMarks Ty[]=new TyMarks[n];
		for(i=0;i<n;i++)
		{
			SM[i]=new StudentMarks();
			Sy[i]=new SyMarks();
			Ty[i]=new TyMarks();
			SM[i].accept();
			Sy[i].accept();
			Ty[i].accept();
		}
		System.out.println("Roll\tName\tCom\tMath\tElc\tTheory\tPract\tTotal\tPercent\tGrade");
		for(i=0;i<n;i++)
		{
			SM[i].display();
			Sy[i].display();
			Ty[i].display();
			total=Sy[i].com+Sy[i].math+Sy[i].elc+Ty[i].the+Ty[i].pra;
			per=total/5;
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
			System.out.println("\t"+total+"\t"+per+"\t"+grade);
		}
	}
	public void display() 
	{
		System.out.print(""+roll+"\t"+name+"\t");
	}
}

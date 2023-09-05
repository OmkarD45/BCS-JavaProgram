import java.util.Scanner;
import Sy3.SyMarks;
import Ty3.*;
public class StudentResult3 {
	int r;	String n;
	public StudentResult3(int r,String n) {
		this.r=r;
		this.n=n;
	}
	void display() {
		System.out.println("Roll no:   "+r+"\nName:   "+n);
	}
	public static void main(String[] args) {
		int a,i,r;	char grade;	String n;
		double c,m,e,t,p,total,per;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total no of Students");
		a=s.nextInt();
		StudentResult3 sr[]=new StudentResult3[a];
		SyMarks sy[]=new SyMarks[a];
		TyMarks ty[]=new TyMarks[a];
		for(i=0;i<a;i++)
		{
			System.out.println("Enter the Roll no & Name:");
			r=s.nextInt();	n=s.next();
			sr[i]=new StudentResult3(r, n);
			System.out.println("Enter the SY Com, Math & Ele Marks:");
			c=s.nextDouble();	m=s.nextDouble();
			e=s.nextDouble();	sy[i]=new SyMarks(c, m, e);
			System.out.println("Enter the TY Theory & Practical Marks:");
			t=s.nextDouble();	p=s.nextDouble();
			ty[i]=new TyMarks(p, t);
		}
		System.out.println("Student Result:");
		for(i=0;i<a;i++)
		{
			sr[i].display();
			System.out.println("Com\tMath\tEle\tThe\tPra\tTot\tPer\tGrade");
			sy[i].display();
			ty[i].display();
			total=sy[i].c+sy[i].m+sy[i].e+ty[i].t+ty[i].p;
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
			System.out.println(total+"\t"+per+"\t"+grade+"\n\n");
		}
	}
}

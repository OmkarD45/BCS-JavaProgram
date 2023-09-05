import Sy.SyMarks;
import Ty.TyMarks;

import java.util.Scanner;

public class Students {
     public int roll;
     public String name;
    public static void main(String [] args)
    {
        int n;
        float per,total;
        char grade;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total number of students:");
        n=s.nextInt();
        Students st[]=new Students[n];
        SyMarks sy[]=new SyMarks[n];
        TyMarks ty[]=new TyMarks[n];
        for (int i=0;i<n;i++)
        {
            st[i]=new Students();
            sy[i]=new SyMarks();
            ty[i]=new TyMarks();
            System.out.println("enter the student "+(i+1)+" roll no and name:");
            st[i].accept();
            sy[i].accept();
            ty[i].accept();
        }
        System.out.println("Roll\tName\tCompt\tMath\tElc\t Theory\tPract\tTotal\tPer\t Grade");
        for (int i=0;i<n;i++)
        {
            st[i].display();
            sy[i].display();
            ty[i].display();
            total=sy[i].c+sy[i].m+sy[i].e+ ty[i].t+ty[i].p;
            per=total/5;
            if(per>=90)
                grade='A';
            else if(per>=70 && per<90)
                grade='B';
            else if(per>=50 && per<70)
                grade='B';
            else if(per>35 && per<50)
                grade='B';
            else
                grade='F';
            System.out.println(""+total+"\t"+per+"\t"+grade);
        }

    }
    void accept()
    {
        Scanner s=new Scanner(System.in);
        roll=s.nextInt();
        name=s.next();
    }
    void display()
    {
        System.out.print("   "+roll+"\t"+name+"\t");
    }
}

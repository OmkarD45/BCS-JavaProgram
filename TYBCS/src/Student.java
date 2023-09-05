import java.util.Scanner;

public class Student {
    int i,roll,m1,m2,m3,total;
    String name;
    float per;
    public static void main(String args[])
    {
        int i,n,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total no of students:");
        n=s.nextInt();
        Student stu[]=new Student[n];
        System.out.println("enter roll no, name and three sub marks");
        for (i=0;i<n;i++)
        {
            j=i+1;
            System.out.println("enter the detail of "+j+" student");
            stu[i]=new Student();
            stu[i].getInfo();
            stu[i].cal();
        }
        System.out.println("Roll no \t Name \t sub1 \t sub2 \t sub3 \t total \t per");
        for (i=0;i<n;i++)
        {
            stu[i].display();
        }
    }
    void getInfo()
    {
        Scanner s=new Scanner(System.in);
        roll=s.nextInt();
        name=s.next();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
    }
    void cal()
    {
        total=(m1+m2+m3);
        per=(total/3);
    }
    void display()
    {
        System.out.println(""+roll+"\t\t\t"+name+"\t  " +m1+"\t  "+m2+"\t  "+m3+"\t"+"  "+total+"\t"+per);
    }
}

import java.util.Scanner;

public class Vehical1 {
    String vno,vname,cmp,vtype;
    Double m;
    public static void main(String args[])
    {
        int n,i;
        Double max;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total no of Vehical:");
        n=s.nextInt();
        Vehical1 v[]=new Vehical1[n];
        for (i=0;i<n;i++)
        {
            System.out.println("enter the vehical "+(i+1)+" detail");
            v[i]=new Vehical1();
            v[i].accept();
        }
        System.out.println("All vehical details:");
        System.out.println("Vno\t\t\tName\tCompany\tType\tMileage");
        for (i=0;i<n;i++)
        {
            v[i].display();
        }
        max=v[0].m;
        for (i=1;i<n;i++)
        {
            if (v[i].m>max)
            {
                max=v[i].m;
            }
        }
        System.out.println("highest mileage Vehical Details:");
        System.out.println("Vno\t\t\tName\tCompany\tType\tMileage");
        for (i=0;i<n;i++)
        {
            if (v[i].m==max)
            {
                v[i].display();
            }
        }
    }
    void accept()
    {
        Scanner s=new Scanner(System.in);
        vno=s.next();
        vname=s.next();
        cmp=s.next();
        vtype=s.next();
        m=s.nextDouble();
    }
    void display()
    {
        System.out.println(""+vno+"\t\t"+cmp+"\t"+vname+"\t"+vtype+"\t"+m);
    }
}

import java.util.Scanner;

public class Vehicle {
    public String vno,cmpy,vname,type;
    public Double m;
    Vehicle(String vno,String cmpy,String vname,String type,double m)
    {
        this.vno=vno;
        this.cmpy=cmpy;
        this.vname=vname;
        this.type=type;
        this.m=m;
    }
    void display()
    {

        System.out.println(""+vno+"\t\t"+cmpy+"\t"+vname+"\t"+type+"\t"+m);
    }
    public static void main(String[] args)
    {
        int n,i;
        String vnoo,cmpn,vnamee,typee;
        Double mm;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total no of vehical:");
        n=s.nextInt();
        Vehicle v[]=new Vehicle[n];
        for (i=0;i<n;i++)
        {
            System.out.println("Enter the detail of vehical "+(i+1));
            vnoo=s.next();
            vnamee=s.next();
            cmpn=s.next();
            typee=s.next();
            mm=s.nextDouble();
            v[i]=new Vehicle(vnoo,cmpn,vnamee,typee,mm);
        }
        System.out.println("All vehical details:");
        System.out.println("Vno\t\t\tName\tCompany\tType\tMileage");
        for (i=0;i<n;i++)
        {
            v[i].display();
        }
        Double max=v[0].m;
        for (i=1;i<n;i++)
        {
            if (v[i].m>max)
            {
                max=v[i].m;
            }
        }
        System.out.println("Details of Highest Mileage Vehical:");
        System.out.println("Vno\t\t\tName\tCompany\tType\tMileage");
        for (i=0;i<n;i++)
        {
            if (max==v[i].m)
            {
                v[i].display();
            }
        }
    }
}

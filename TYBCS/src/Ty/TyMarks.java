package Ty;

import java.util.Scanner;

public class TyMarks {
    public float t,p;
    public void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Ty theory and practical marks:");
        t=s.nextFloat();
        p=s.nextFloat();
    }
    public void display()
    {
        System.out.print(""+t+"\t"+p+"\t");
    }
}

package Sy;

import java.util.Scanner;

public class SyMarks {
    public float c,m,e;
    public void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Sy marks of computer, math and electronic:");
        c=s.nextFloat();
        m=s.nextFloat();
        e=s.nextFloat();
    }
    public void display()
    {
        System.out.print(""+c+"\t"+m+"\t"+e+"\t");
    }
}

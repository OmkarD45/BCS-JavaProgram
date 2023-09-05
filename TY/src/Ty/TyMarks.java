package Ty;

import java.util.Scanner;

public class TyMarks 
{
	public float the,pra;
	public void accept()
	{
		System.out.println("Enter the Ty marks (Theory and Practical:)");
		Scanner s=new Scanner(System.in);
		the=s.nextFloat();
		pra=s.nextFloat();
	}
	public void display()
	{
		System.out.print(""+the+"\t"+pra);
	}
}

package Sy;

import java.util.Scanner;

public class SyMarks 
{
	public float com,math,elc;
	public void accept()
	{
		System.out.println("Enter the Sy marks (com, math, elc)");
		Scanner s=new Scanner(System.in);
		com=s.nextFloat();
		math=s.nextFloat();
		elc=s.nextFloat();
	}
	public void display()
	{
		System.out.print(""+com+"\t"+math+"\t"+elc+"\t");
	}
}

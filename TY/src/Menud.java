import java.util.Scanner;
import java.io.*;
public class Menud
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int ch,q=0;
     do{
        System.out.println("1.volume of cylinder\n2.factorial of no\n3.check no is armstrong or not\n4.exit");
        System.out.println("Enter the choice");
        ch=s.nextInt();
         switch(ch)
          {
           case 1:float r,h;
                  double val;
                 System.out.println("Enter the radius of cylinder");
                 r=s.nextInt();
                 System.out.println("Enter the heigth of Cylinder");
                 h=s.nextFloat();
                 val=3.14*(r*r*h);
                
                 System.out.println("Enter the volume of cylinder==>"+val);
                  break;
           case 2:int fact=1,n;
                  System.out.println("Enter the Number");
                  n=s.nextInt();
                  for(int i=0;i<=n;i++)
                  {  
                  fact=fact*i;
                  }
                  System.out.println("Factorial is:"+fact);
                  break;
           case 3:int sum=0,num,rem,m;
                    System.out.println("Enter the Number");
                    num=s.nextInt();
                    m=num;
                    while(num>=0)
                    {
                    	rem=num%10;
                    	sum=sum+(rem*rem*rem);
                    	num=num/10;
                    }
                    if(m==num)
                     {
                    	System.out.println("No.is not armstrong:");
                     }
                     else
                     {
                    	 System.out.println("No.is armstrong:");
                     }
                     break;
           case 4:q=1;
                  break;
                  }
      }while(q==0);
   }
}

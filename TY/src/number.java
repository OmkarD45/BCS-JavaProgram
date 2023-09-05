import java.io.*;
import java.util.*;
class number
{
    int n;
    public static void main(String[] args) 
    {
        number no=new number();
        no.accept();
        no.check();
    }
    void accept()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
    }
    void check()
    {
        if(n>=1 && n<=100)
        {
            if(n%2!=0)
            {
              System.out.println("Weird");
            }
            else if(n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
    }
}



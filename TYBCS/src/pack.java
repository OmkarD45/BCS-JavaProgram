import Series.*;

import java.util.Scanner;
public class pack
{
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Series Limit");
        n=s.nextInt();
        System.out.println("Prime no series:");
        Primeno p=new Primeno();
        p.prime(n);
        System.out.println("");
        System.out.println("Fibonacci no series:");
        Fiboo f=new Fiboo();
        f.fibo(n);
        System.out.println("");
        System.out.println("Square of no series:");
        Square_of_no sq=new Square_of_no();
        sq.square(n);
    }
}


import Shapes.*;

import java.util.Scanner;

public class AV
{
        public static void main(String args[])
        {
            double cyr,cyh,cul,cub,cuh,tb,th;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter radius and height of cylinder=");
            cyr=s.nextDouble();
            cyh=s.nextDouble();
            Cylinder cy=new Cylinder();
            cy.area(cyr,cyh);
            cy.volume(cyr,cyh);
            System.out.println("Enter length, breadth and height of cuboid=");
            cul=s.nextDouble();
            cub=s.nextDouble();
            cuh=s.nextDouble();
            Cuboid cu=new Cuboid();
            cu.area(cul,cub,cuh);
            cu.volume(cul,cub,cuh);
            System.out.println("Enter the breadth and height of triangle=");
            tb=s.nextDouble();
            th=s.nextDouble();
            Triangle tr=new Triangle();
            tr.area(tb,th);
        }
}
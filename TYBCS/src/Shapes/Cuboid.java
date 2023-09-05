package Shapes;

public class Cuboid
{
    public void area(double l,double b,double h)
    {
        double area=2*(l*b+b*h+l*h);
        System.out.println("Area of Cuboid:"+area);
    }
    public void volume(double l,double b,double h)
    {
        double volume=l*b*h;
        System.out.println("Volume of a Cuboid:"+volume);
    }
}

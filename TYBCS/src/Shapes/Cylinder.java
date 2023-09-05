package Shapes;

public class Cylinder
{
    public void  area(double r,double h)
    {
        double area=2*3.14*r*(r+h);
        System.out.println("Area of a cylinder:"+area);
    }
    public void volume(double r,double h)
    {
        double volume=2*3.14*r*r*h;
        System.out.println("Volume of a cylinder:"+volume);
    }
}

package practicingofexam;

public class traingle extends shape
{
    double base;
    double height;
     public double getBase() 
     {
        return base;

    }  	             
    public double getHeight()             
    {
        return height;
    } 
    public void setBase(double b)     
    {
        base = b;

    }
      	             
    public void setHeight(double h)     
    {
        height=h;

    } 
    public double area()
    {
        return (1/2*base*height); 
    }
    public double volume()
    {
        return -1;
    }
}
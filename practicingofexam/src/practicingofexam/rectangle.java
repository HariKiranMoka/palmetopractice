package practicingofexam;

public class rectangle extends shape 
{ 
    private double length;
    private double width;
     public double getLength() 
     {
        return length;

    }  	             
    public double getWidth()             
    {
        return width;
    } 
    public void setLength(double l)     
    {
        length = l;

    }
      	             
    public void setWidth(double w)     
    {
        width = w;

    } 
    public double area()
    {
        return (length*width); 
    }
    public double volume()
    {
        return -1;
    }
}
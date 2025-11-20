public class shapeclass {
    public static void main(String[] args)
    {
       circle c1=new circle(20);
       c1.area();
       System.out.println("\n");
       rectangle r1=new rectangle(50,60);
       r1.area();
    }
}
abstract class shape
{
    abstract void area();
}
class circle extends shape
{
    int r;
    circle(int r)
    {
       this.r=r;
    }
    void area()
    {
      double result=3.14*r*r;
      System.out.print("area of circle="+result);
    }
}
class rectangle
{
    int l,b;
    rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void area()
    {
       double result=l*b;
        System.out.print("area of rectangle="+result);
    }
}
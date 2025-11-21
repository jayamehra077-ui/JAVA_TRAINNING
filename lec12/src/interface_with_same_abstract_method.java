public class interface_with_same_abstract_method {
    public static void main(String[] args)
    {
     Ca1 c1=new Ca1();
     c1.msg();
    }
}
interface Aa1
{
    void msg();
}
interface Ba1
{
    void msg();
}
class Ca1 implements Aa1,Ba1
{
    public void msg()
    {
        System.out.println("----HEYYY-----");
    }
}

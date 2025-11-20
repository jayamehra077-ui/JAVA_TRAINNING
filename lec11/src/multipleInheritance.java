//java m I ko support nhi karta qki child c confuse ho
// jata h ki kis class ke sleep function ko use kre
//abstraction ko achieve karne ke 2 tarike h
//1.abstract classes
//2.interface//fully abstract//overriding is compulsory
public class multipleInheritance {
    public static void main(String[] args)
    {

        B b1=new B();
        b1.sleep();
    }
}
interface A
{
   void sleep();



}
class B implements A
{
  public void sleep()
  {
     System.out.println("sleppp time!!!!!!!!!!!!!!");
  }
}
//class C extends A,B
//{

//}

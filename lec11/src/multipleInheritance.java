//java m I ko support nhi karta qki child c confuse ho
// jata h ki kis class ke sleep function ko use kre
//abstraction ko achieve karne ke 2 tarike h
//1.abstract classes
//2.interface//fully abstract//overriding is compulsory
public class multipleInheritance {
    public static void main(String[] args)
    {

        C c1=new C();
        C c2=new C();
        c2.data();
        c1.sleep();
        //c2.data();

    }
}
interface A
{
   void sleep();

default void data()
{
    System.out.println("hey everyone!!!!!!!!!!!");
}

}

interface B
{
    void sleep();
}
class C implements A,B
{
    public void sleep()
    {
        System.out.println("Itsss  sleeeppp time!!!!!!!!!!!!!");
    }
}
//class C extends A,B
//{

//}

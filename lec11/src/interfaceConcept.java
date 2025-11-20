public class interfaceConcept {
    public static void main(String[] args)
    {

        B1 b1=new B1();
        b1.sleep();
    }
}
interface A1
{
    void sleep();



}
class B1 implements A
{
    public void sleep()
    {
        System.out.println("sleeppp time!!!!!!!!!!!!!!");
    }
}


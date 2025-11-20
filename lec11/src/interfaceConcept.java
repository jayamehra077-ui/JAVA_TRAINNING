public class interfaceConcept {
    public static void main(String[] args)
    {

        B b1=new B();
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


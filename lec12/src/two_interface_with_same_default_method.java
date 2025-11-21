public class two_interface_with_same_default_method {
    public static void main(String[] args)
    {

    }
}
interface A1
{
    default void fun()
    {
        System.out.println("---A---");
    }
}
interface B1
{
    default void fun()
    {
        System.out.println("---B---");
    }
}//COMPILE TIME ERROR BCZ BOTH A AND B PROVIDES DEFAULT IMPLIMENTATION

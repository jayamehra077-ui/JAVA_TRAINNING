public class private_method_in_interface {
    public static void main(String[] args)
    {
        new B().show();
    }
}
interface A
{
    private void helper()
    {
        System.out.println("HELPER_LOGIC");
    }
    default void show()
    {
        helper();
        System.out.println("DEfault_show");
    }
}
class B implements A{

}
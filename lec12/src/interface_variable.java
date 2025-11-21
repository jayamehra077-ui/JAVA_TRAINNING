public class interface_variable {
    public static void main(String[] args)
    {
        System.out.println(A.city);
        //A.city="indore";//cannot assign value
        //reason-all interface variables are implicitly
    }
}
interface A
{
    String city="----from bhopal----";
}
//
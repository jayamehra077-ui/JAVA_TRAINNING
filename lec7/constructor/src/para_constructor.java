public class para_constructor {
    public static void main(String[] args)
    {
        car obj=new car("jaya");
        car obj1=new car("mehra");
        car obj2=new car("from narsinghpur");
    }
}
class car
{
    car(String str) {


        System.out.println(str);
    }
}

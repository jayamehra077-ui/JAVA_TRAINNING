abstract class hello
{
    abstract void intro();//abstract ka object nhi banta
    //abstract method ka override karna compulsory h
}
class hey extends hello{
    void intro()
    {
      System.out.println("hey everyone!!!!!!!!!\n myself jaya mehra");
    }
}
public class abstraction {
    //essential part  show na karna #abstraction
    public static void main(String[] args)
    {
      hey h1=new hey();
      h1.intro();
    }
}


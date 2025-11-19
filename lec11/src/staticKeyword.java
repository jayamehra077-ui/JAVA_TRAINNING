public class staticKeyword {
    public static void main(String[] args)
    {
      //parent p1;
        System.out.println("--- Static Method Calls ---");
        parent.staticMethod(); // Calls parent's staticMethod
        child.staticMethod();  // Calls child's staticMethod (hiding parent's)

        // Demonstrate instance method calls with polymorphism
        System.out.println("\n--- Instance Method Calls ---");
        parent p1 = new parent();
        p1.instanceMethod(); // Calls parent's instanceMethod

        parent p2 = new child(); // Polymorphism: parent reference to child object
        p2.instanceMethod(); // Calls child's instanceMethod (overriding parent's)

        child c1 = new child();
        c1.instanceMethod(); // Calls child's instanceMethod
    }
}


class parent
{
    static void staticMethod()
    {
        System.out.println("parent static");
    }
     void instanceMethod()
    {
        System.out.println("parent instance");
    }
}
class child extends parent
{
    static void staticMethod()
    {
        System.out.println("child static");
    }
    void instanceMethod()
    {
        System.out.println("child instance");
    }
}

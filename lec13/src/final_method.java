public class final_method {
}
class parent
{
    final void show()
    {
        System.out.println("--parent show--");
    }
}
class child extends parent{
   // void show()//show()' cannot override 'show()' in
    // 'parent'; overridden method is final
    {

    }
}

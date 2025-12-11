public class join_method {

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        My_thread1 t1=new My_thread1();
        t1.start();
        try {
            t1.join();

        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println(e);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(i+"main");
        }
    }
}
class My_thread1 extends Thread
{
    public void  run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println("---hiiiii----");
        for(int i=0;i<5;i++)
        {
            System.out.println(i+"t1");
        }
    }
}

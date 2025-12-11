public class thread_syntax {
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        My_thread t1=new My_thread();
        t1.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(i+"main");
        }
    }
}
class My_thread extends Thread
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
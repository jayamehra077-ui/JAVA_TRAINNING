public class runnable_method {
    public static void main(String[] args)
    {
        my_thread task=new my_thread();
        Thread t1=new Thread();
        Thread t2=new Thread();
        t1.start();
        t2.start();
    }
}
class my_thread implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<100;i++)
        {System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println(e);
            }
            }
       // System.out.println("---hey everyone--");
    }
}
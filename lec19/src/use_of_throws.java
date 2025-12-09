public class use_of_throws {
    public static void main(String[] args)
    {
        try {
            riskyMethod();
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("main me handle hua:"+e);
        }
        System.out.println("program continue:...");
    }
    static void riskyMethod() throws ArithmeticException
    {
        System.out.println("riskyMethod start..");
        int result=10/0;
        System.out.println("result:"+result);
        System.out.println("risky method end");
    }

}

public class exception_handling {
    public static void main(String[] args)
    {
        System.out.println("---heyy---");
        try {
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println(e);
        }
        System.out.println("--byee--");
    }
}

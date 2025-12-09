import java.util.*;
public class exception_handling3 {
    public static void main(String[] args)
    {
        System.out.println("--heyy--");
        try {
            String str=null;
            System.out.println(str.length());
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println(e);
        }
        finally {
            System.out.println("--hamesha chalta h ---");
        }
        System.out.println("--byee--");
    }
}

import java.util.Scanner;
public class string {
    public static void main(String[] args)
    {
        String str="   Jaya Mehra    ";
        System.out.println("you have entered:");
        System.out.println(str);
        System.out.println("length of string:");
        System.out.println(str.length());
        System.out.println("char at given position:");
        System.out.println(str.charAt(3));
        System.out.println("lower case:");
        System.out.println(str.toLowerCase());
        System.out.println("upper case:");
        System.out.println(str.toUpperCase());
        System.out.println("index of given string:");
        System.out.println(str.indexOf("j"));
        System.out.println("substring of given positions:");
        System.out.println(str.substring(0,4));
        System.out.println("trim:");
        System.out.println(str.trim());
        String str1=new String("JAYA");
        String str2=new String("JAYA");
        System.out.println("is str1==str2?");
        System.out.println(str1==str2);
        System.out.println("is str1=str2");
        System.out.println(str1.equals(str2));
    }
}

public class pallindrome {
    public static void main(String[] args)
    {
        String a="naman";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equals(b))
        {
            System.out.println("string pallindrome haiiii");
        }
        else {
            System.out.println("string pallindrome nahiii haiiii");
        }
    }
}

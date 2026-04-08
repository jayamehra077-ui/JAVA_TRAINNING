public class rvs_str {
    public static void main(String[] args)
    {
        String str1="jayamehra";
        String rev_str="";
        for(int i=str1.length()-1;i>0;i--)
        {
            rev_str=rev_str+ str1.charAt(i);
        }
        System.out.println(rev_str);
    }
}

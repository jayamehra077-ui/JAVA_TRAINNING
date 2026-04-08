import java.util.Arrays;

public class is_anagram {
    public static void main(String[] args)
    {
        String str1="silent";
        String str2="listen";
        char[] A1=str1.toCharArray();
        char[] A2=str2.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        if( Arrays.equals(A1,A2))
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("not Anagram");
        }
    }
}

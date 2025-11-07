public class vowel_consonant {
    public static void main(String[] args)
    {
        String str="jayamehra";
        int v=0;
        for(char ch:str.toCharArray())
        {
            if("aeUioAEUIO".indexOf(ch)!=-1)
            {
                v++;
            }
        }
        System.out.println(v);
    }
}

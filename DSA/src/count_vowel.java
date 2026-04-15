public class count_vowel {
    static int vowel(String str,int i)
    {
        if(i==str.length()) return 0;
        char ch=str.charAt(i);
        int val=(ch =='a'||ch =='o'||ch =='e'||ch =='i'||ch =='u')? 1:0;
                return val+vowel(str,i+1);


    }
    public static void main(String[] args)
    {
        String str="hello";
        int i=0;
        System.out.println(vowel(str,i));

    }
}

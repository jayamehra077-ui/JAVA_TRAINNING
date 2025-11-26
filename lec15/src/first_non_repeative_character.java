import java.util.*;
public class first_non_repeative_character {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "jaya_mehra";
        System.out.println("frequency of characters in given string:\n ");
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for (char ch : str.toCharArray()) {
            {
                if (map.get(ch) == 1) {
                    System.out.println("first non repeative character=" + ch);
                    break;
                }
            }
        }
    }
}





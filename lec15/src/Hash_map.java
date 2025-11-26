import java.util.*;
public class Hash_map {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,2);
        map.put(1,3);
        map.put(2,5);
        System.out.println("----MAP-----"+map);
        System.out.println("value at 0="+map.get(0));
        System.out.println(map.getOrDefault(9,0));

    }
}

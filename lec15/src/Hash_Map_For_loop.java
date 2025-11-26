import java.util.HashMap;

public class Hash_Map_For_loop {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 2);
        map.put(1, 3);
        map.put(2, 5);
        System.out.println("----HASH_MAP-----\n" + map);
        System.out.println("--hash_map using for loop---\n");
        for(int x:map.keySet())
        {
            System.out.println(map.get(x));
        }
    }
}

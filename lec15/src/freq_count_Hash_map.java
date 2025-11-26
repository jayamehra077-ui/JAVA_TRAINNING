import java.util.HashMap;

public class freq_count_Hash_map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
       // map.put(0, 2);
       // map.put(1, 3);
       // map.put(2, 5);
      //  System.out.println("----MAP-----" + map);
      //  System.out.println("\n");
        int arr[]={1,2,1,2,4,4,5,6,0,9,8,7,0,6,};
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println("----frequency of elements----");
        System.out.println( map);
    }
}

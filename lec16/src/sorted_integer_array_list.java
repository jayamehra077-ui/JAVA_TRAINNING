import java.util.*;
public class sorted_integer_array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2000);
        list.add(40);
        list.add(90);
        list.add(80);
        System.out.println("--ARRAY_LIST---\n"+list);
        Collections.sort(list);
        System.out.println("--SORTED_ARRAY_LIST---\n"+list);

    }
}

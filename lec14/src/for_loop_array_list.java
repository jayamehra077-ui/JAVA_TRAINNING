import java.util.*;
public class for_loop_array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(0,3);
        list.add(3,4);
        list.add(15);
        System.out.println("----array list---\n"+list);

        System.out.println("---list using for loop---");

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}

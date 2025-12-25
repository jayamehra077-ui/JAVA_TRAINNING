import java.util.ArrayList;
import java.util.List;

public class ascending_sort {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(9);
        list.add(7);
        list.add(93);
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.print("-----liste elements are: -----\n"+""+list);
        System.out.println("\n");
        List<Integer> sort=list.stream().sorted((a,b)->a-b).toList();
        System.out.print("----list in ascending order-----\n"+""+sort);
    }
}



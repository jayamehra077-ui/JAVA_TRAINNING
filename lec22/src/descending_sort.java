import java.util.ArrayList;
import java.util.List;

public class descending_sort {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(23);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> sort=list.stream().sorted((a, b)->b-a).toList();
        System.out.print("----descending order-----\n"+""+sort);
    }
}





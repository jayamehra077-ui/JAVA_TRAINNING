import java.util.ArrayList;
import java.util.List;

public class map_method {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(23);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> map=list.stream().map(n->n*10).toList();
        System.out.print("----elements of list after multiply by 10-----\n"+""+map);
    }
}



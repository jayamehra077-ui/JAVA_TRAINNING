import java.util.ArrayList;
import java.util.List;

public class map_method {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(200);
        list.add(900);
        list.add(207);
        list.add(203);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> map=list.stream().map(n->n*100).toList();
        System.out.print("----elements of list after multiply by 200-----\n"+""+map);
    }
}



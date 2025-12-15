import java.util.ArrayList;
import java.util.List;

public class filter_method {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(29);
        list.add(89);
        list.add(34);
        list.add(23);
        list.add(45);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> result=list.stream().filter(n->n>20).toList();
        System.out.print("-----elements of list greater less than 90-----\n"+""+result);
    }
}



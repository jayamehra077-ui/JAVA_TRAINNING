import java.util.ArrayList;
import java.util.List;

public class skip_method {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(23);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> skip=list.stream().skip(2).toList();
        System.out.print("----elements of list after skiping  elements-----\n"+""+skip);
    }
}




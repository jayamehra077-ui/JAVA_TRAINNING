import java.util.ArrayList;
import java.util.List;

public class limit_method {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(33);
        list.add(53);
        list.add(73);
        list.add(63);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
        List<Integer> limit=list.stream().limit().toList();
        System.out.print("----elements of list after limiting 3 elements-----\n"+""+limit);
    }
}



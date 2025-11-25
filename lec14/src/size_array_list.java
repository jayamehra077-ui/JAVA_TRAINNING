import java.util.ArrayList;

public class size_array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(0,3);
        list.add(3,4);
        list.add(15);
        System.out.println("----array list---\n"+list);
        int size=list.size();
        boolean isEmpty=list.isEmpty();
        System.out.println("----size of array list="+size);
    }

}

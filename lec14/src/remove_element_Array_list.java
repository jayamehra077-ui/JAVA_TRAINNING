import java.util.ArrayList;

public class remove_element_Array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(0,3);
        list.add(3,4);
        list.add(15);
        System.out.println("----array list---\n"+list);
        list.remove(3);
        System.out.println("----new array list after removing element---\n"+list);
    }
}



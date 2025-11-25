import java.util.ArrayList;

public class search_operation_array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(0,3);
        list.add(3,4);
        list.add(15);
        System.out.println("----array list---\n"+list);
        boolean exist=list.contains(30);
        System.out.println("is exist??"+exist);
        int idx1=list.indexOf("index of given element="+22);
        int idx2= list.lastIndexOf("last index"+15);
    }
}


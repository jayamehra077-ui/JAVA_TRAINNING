import java.util.ArrayList;

public class acces_element_array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(0,3);
        list.add(3,4);
        list.add(15);
        System.out.println("----array list---\n"+list);
        //System.out.println("----array list---\n"+list);
        int first=list.get(0);
        System.out.println("----element at 0th index="+first);
        //int last=list.get(list.size-1);
    }

}

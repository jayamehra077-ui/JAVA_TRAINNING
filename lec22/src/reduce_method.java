import java.util.*;
//java.util.stream;
public class reduce_method {
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(90);
        list.add(27);
        list.add(23);
        System.out.print("-----list-----\n"+""+list);
        System.out.println("\n");
       int data= list.stream().reduce(0,(a,b)->a+b);
        System.out.print("-----sum of elements-----\n"+""+data);
    }
}

import java.util.*;
public class intersection_of_two_array {
    public static void main(String[] args)
    {
        int arr1[]={1,2,3,4,5};
        int arr12[]={1,21,32,4,5};
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int x:arr1)
        {
          set1.add(x)  ;
        }
        for(int y:arr12)
        {
           // set1.add(x)  ;
            if(set1.contains(y));
            set2.add(y);
            System.out.println(y);
        }
    }
}

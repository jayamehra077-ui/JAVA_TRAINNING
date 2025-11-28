import java.util.*;
public class find_duplicate {
    public static void main(String[] args)
    {
        int arr[]={23,45,23,87};
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr)
        {
            if(set.contains(x))
            {
                System.out.println(true);
            }
            set.add(x);
            System.out.println(false);
        }
    }
}
